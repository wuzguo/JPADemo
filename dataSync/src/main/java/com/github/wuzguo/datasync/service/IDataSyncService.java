package com.github.wuzguo.datasync.service;

/**
 * 数据同步Service
 *
 * @author wzguo
 * @date 2016年11月26日 下午3:23:11
 */
public interface IDataSyncService {

    /**
     * 获取到消息
     *
     * @param message
     */
    public void onMessage(String message);
}
