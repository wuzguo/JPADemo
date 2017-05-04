package com.github.wuzguo.datasync.internal;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.github.wuzguo.datasync.entity.MOrderTrack;
import com.github.wuzguo.datasync.service.IDataSyncService;
import com.github.wuzguo.datasync.service.IMOrderTrackService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 订单跟踪数据同步Service
 *
 * @author wzguo
 * @date 2016年11月26日 下午3:23:43
 */
@Service
public class OrderTrackDataSyncServiceImpl implements IDataSyncService {

    private static SerializeConfig mapping = new SerializeConfig();

    static {
        mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss.SSS"));
    }

    // 日志
    private static final Logger log = Logger.getLogger(OrderTrackDataSyncServiceImpl.class);

    @Autowired
    IMOrderTrackService orderTrackService;

    @Override
    @JmsListener(destination = "${mq.queue.sync.track}")
    public void onMessage(String message) {
        log.debug("收到订单跟踪同步数据消息:");
        log.debug(message);

        try {
            List<MOrderTrack> orderTracks = JSON.parseArray(message, MOrderTrack.class);
            orderTrackService.insert(orderTracks);
            log.debug("订单跟踪同步数据消息如露完毕！！！");
        } catch (Exception e) {
            log.error("订单跟踪同步数据解析入库异常,报文内容:" + message);
            log.error("订单跟踪同步数据解析入库异常", e);
        }
    }

}
