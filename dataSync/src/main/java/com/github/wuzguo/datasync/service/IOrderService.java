package com.github.wuzguo.datasync.service;


import com.github.wuzguo.datasync.entity.Order;

import java.util.List;
import java.util.Map;

public interface IOrderService extends IBaseService<Order, String> {


    /**
     * 根据运单号查询最大的订单号
     *
     * @param params
     * @return
     */
    List<Order> findMaxOrder(Map params);

}
