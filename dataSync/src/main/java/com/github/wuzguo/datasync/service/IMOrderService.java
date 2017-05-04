package com.github.wuzguo.datasync.service;


import com.github.wuzguo.datasync.entity.MOrder;

public interface IMOrderService extends IBaseService<MOrder, String> {

    /**
     * 批量插入
     *
     * @param entitys
     * @return
     */
    public Iterable<MOrder> insert(Iterable<MOrder> entitys);
}
