package com.github.wuzguo.datasync.internal;

import com.github.wuzguo.datasync.entity.Order;
import com.github.wuzguo.datasync.repository.OrderRepository;
import com.github.wuzguo.datasync.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderRepository orderRepository;


    public long count() {
        return orderRepository.count();
    }

    @Override
    public Order insert(Order entity) {
        return orderRepository.save(entity);
    }

    @Override
    public Order update(Order entity) {
        return orderRepository.save(entity);
    }

    @Override
    public Order save(Order entity) {
        return orderRepository.save(entity);
    }

    @Override
    public Order get(String id) {
        return orderRepository.findOne(id);
    }

    @Override
    public void delete(String id) {
        orderRepository.delete(id);
    }

    @Override
    public List<Order> find(Map params) {
        return orderRepository.findAll(createSpecification(params));
    }

    @Override
    public long count(Map params) {
        return orderRepository.count(createSpecification(params));
    }

    @Override
    public Page<Order> findPage(Map params, Pageable pageable) {
        Page<Order> page = orderRepository.findAll(createSpecification(params), pageable);
        return page;
    }

    @Override
    public List<Order> findMaxOrder(Map params) {
        return orderRepository.findAll(createMaxOrderSpecification(params), new Sort(Sort.Direction.DESC, "orderNum"));
    }


    public static Specification createSpecification(final Map params) {
        return new Specification<Order>() {
            @Override
            public Predicate toPredicate(Root<Order> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList();
                //cb.equal(root.get("").as(String.class), params.get("xxx"));

                return cb.and(list.toArray(new Predicate[0]));
            }

        };
    }

    /**
     * 查询
     *
     * @param params
     * @return
     */
    public static Specification createMaxOrderSpecification(final Map params) {
        return new Specification<Order>() {
            @Override
            public Predicate toPredicate(Root<Order> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList();

                String goodsTicketNo = params.get("goodsTicketNo").toString();

                if (!StringUtils.isEmpty(goodsTicketNo)) {
                    list.add(cb.equal(root.get("goodsTicketNo").as(String.class), goodsTicketNo));
                }

                return cb.and(list.toArray(new Predicate[0]));
            }
        };
    }
}
