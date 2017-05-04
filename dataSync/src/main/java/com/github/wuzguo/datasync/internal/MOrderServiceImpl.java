package com.github.wuzguo.datasync.internal;


import com.github.wuzguo.datasync.entity.MOrder;
import com.github.wuzguo.datasync.repository.MOrderRepository;
import com.github.wuzguo.datasync.service.IMOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MOrderServiceImpl implements IMOrderService {

    @Autowired
    private MOrderRepository orderRepository;

    public long count() {
        return orderRepository.count();
    }

    @Override
    public MOrder insert(MOrder entity) {
        return orderRepository.save(entity);
    }

    @Override
    @Transactional
    public Iterable<MOrder> insert(Iterable<MOrder> entitys) {
        return orderRepository.save(entitys);
    }

    @Override
    public MOrder update(MOrder entity) {
        return orderRepository.save(entity);
    }

    @Override
    public MOrder save(MOrder entity) {
        return orderRepository.save(entity);
    }

    @Override
    public MOrder get(String id) {
        return orderRepository.findOne(id);
    }

    @Override
    public void delete(String id) {
        orderRepository.delete(id);
    }

    @Override
    public List<MOrder> find(Map params) {
        return orderRepository.findAll(createSpecification(params));
    }

    @Override
    public long count(Map params) {
        return orderRepository.count(createSpecification(params));
    }

    @Override
    public Page<MOrder> findPage(Map params, Pageable pageable) {
        Page<MOrder> page = orderRepository.findAll(createSpecification(params), pageable);
        return page;
    }

    public static Specification createSpecification(Map params) {
        return new Specification<MOrder>() {
            @Override
            public Predicate toPredicate(Root<MOrder> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList();
                //cb.equal(root.get("").as(String.class), params.get("xxx"));
                return cb.and(list.toArray(new Predicate[0]));
            }

        };
    }

}
