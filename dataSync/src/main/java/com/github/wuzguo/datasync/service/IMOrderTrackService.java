package com.github.wuzguo.datasync.service;


import com.github.wuzguo.datasync.entity.MOrderTrack;

public interface IMOrderTrackService extends IBaseService<MOrderTrack, String> {

    /**
     * 批量插入
     *
     * @param entitys
     * @return
     */
    public Iterable<MOrderTrack> insert(Iterable<MOrderTrack> entitys);
}
