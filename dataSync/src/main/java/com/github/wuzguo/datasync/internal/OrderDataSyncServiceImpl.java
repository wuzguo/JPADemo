package com.github.wuzguo.datasync.internal;

import com.alibaba.fastjson.JSON;
import com.github.wuzguo.datasync.entity.MOrder;
import com.github.wuzguo.datasync.service.IDataSyncService;
import com.github.wuzguo.datasync.service.IMOrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单数据同步Service
 *
 * @author wzguo
 * @date 2016年11月26日 下午3:23:43
 */
@Service
public class OrderDataSyncServiceImpl implements IDataSyncService {
    // 日志
    private static final Logger log = Logger.getLogger(OrderDataSyncServiceImpl.class);

    @Autowired
    IMOrderService orderService;

    @Override
    @JmsListener(destination = "${mq.queue.sync.order}")
    public void onMessage(String message) {
        log.debug("收到订单同步数据消息:");
        log.debug(message);

        try {
            List<MOrder> orders = JSON.parseArray(message, MOrder.class);
            log.debug("[OrderDataSyncServiceImpl] onMessage orders: " + orders);
            orderService.insert(orders);
            log.debug("订单同步数据消息如露完毕！！！");
        } catch (Exception e) {
            log.error("订单同步数据解析入库异常,报文内容:" + message);
            log.error("订单同步数据解析入库异常", e);
        }
    }

}
