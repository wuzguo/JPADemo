package com.github.wuzguo.api.web;

import com.alibaba.fastjson.JSONArray;
import com.github.wuzguo.api.vo.OrderTrackVo;
import com.github.wuzguo.api.vo.Result;
import com.github.wuzguo.datasync.entity.BureauCode;
import com.github.wuzguo.datasync.entity.Order;
import com.github.wuzguo.datasync.entity.OrderTrack;
import com.github.wuzguo.datasync.service.IBureauCodeService;
import com.github.wuzguo.datasync.service.IOrderService;
import com.github.wuzguo.datasync.service.IOrderTrackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单查询Controller
 *
 * @author vivi207
 * @date 2016年11月26日 下午3:24:25
 */
@RestController
@RequestMapping("/order/")
public class OrderController {

    // 日志
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private IOrderTrackService orderTrackService;

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IBureauCodeService bureauCodeService;

    /**
     * 根据货票号查询跟踪信息
     *
     * @param waybillNo
     * @return
     */
    @RequestMapping("/tracks/{waybillNo}")
    public Result findTracks(@PathVariable("waybillNo") final String waybillNo, final HttpServletRequest request, final HttpServletResponse response) {
        Map<String, String> mapParam = new HashMap<String, String>(2);
        mapParam.put("goodsTicketNo", waybillNo);

        List<Order> orderList = orderService.findMaxOrder(mapParam);
        // 如果列表为空
        if (orderList == null || orderList.size() <= 0) {
            return new Result(false, "查询失败");
        }

        mapParam.clear();
        mapParam.put("orderNum", orderList.get(0).getOrderNum());

        List<OrderTrack> trackList = orderTrackService.find(mapParam);

        JSONArray trackListJson = null;
        List<OrderTrackVo> orderTrackVoList = null;

        if (trackList != null && trackList.size() > 0) {

            orderTrackVoList = new ArrayList<OrderTrackVo>(trackList.size() * 3 / 2 + 1);
            OrderTrackVo orderTrackVo = null;

            // 日期格式化
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            for (OrderTrack orderTrack : trackList) {
                orderTrackVo = new OrderTrackVo(orderTrack);

                if (orderTrack.getCreateTime() != null) {
                    orderTrackVo.setCreateTime(dateFormat.format(orderTrack.getCreateTime()));
                }
                if (orderTrack.getDepartureDate() != null) {
                    orderTrackVo.setDepartureDate(dateFormat.format(orderTrack.getDepartureDate()));
                }
                if (orderTrack.getInputTime() != null) {
                    orderTrackVo.setInputTime(dateFormat.format(orderTrack.getInputTime()));
                }
                if (orderTrack.getJjsj() != null) {
                    orderTrackVo.setJjsj(dateFormat.format(orderTrack.getJjsj()));
                }
                if (orderTrack.getStatusTime() != null) {
                    orderTrackVo.setStatusTime(dateFormat.format(orderTrack.getStatusTime()));
                }

                orderTrackVoList.add(orderTrackVo);
            }
        }

        Result result = new Result(true, "成功");

        result.setRetObject(orderTrackVoList);
        return result;
    }

    /**
     * 获取字典
     *
     * @param request
     * @return
     */
    @RequestMapping("/tracks/dict")
    public Result getDict(final HttpServletRequest request) {

        List<BureauCode> bureauCodes = bureauCodeService.find(null);
        Result result = new Result(true, "成功");
        result.setRetObject(bureauCodes);
        return result;
    }
}
