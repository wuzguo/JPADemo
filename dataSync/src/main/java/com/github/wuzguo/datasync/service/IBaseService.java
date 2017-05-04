package com.github.wuzguo.datasync.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface IBaseService<T, ID> {

    public T insert(T entity);

    public T update(T entity);

    public T save(T entity);

    public T get(ID id);

    public void delete(ID id);

    public List<T> find(Map params);

    public long count(Map params);

    public Page<T> findPage(Map params, Pageable pageable);

}
