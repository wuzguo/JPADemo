package com.github.wuzguo.datasync.internal;


import com.github.wuzguo.datasync.entity.MOrderTrack;
import com.github.wuzguo.datasync.repository.MOrderTrackRepository;
import com.github.wuzguo.datasync.service.IMOrderTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
public class MOrderTrackServiceImpl implements IMOrderTrackService {

    @Autowired
    private MOrderTrackRepository orderTrackRepository;

    public long count() {
        return orderTrackRepository.count();
    }

    @Override
    public MOrderTrack insert(MOrderTrack entity) {
        return orderTrackRepository.save(entity);
    }

    @Override
    public MOrderTrack update(MOrderTrack entity) {
        return orderTrackRepository.save(entity);
    }

    @Override
    public MOrderTrack save(MOrderTrack entity) {
        return orderTrackRepository.save(entity);
    }

    @Override
    @Transactional
    public Iterable<MOrderTrack> insert(Iterable<MOrderTrack> entitys) {
        return orderTrackRepository.save(entitys);
    }

    @Override
    public MOrderTrack get(String id) {
        return orderTrackRepository.findOne(id);
    }

    @Override
    public void delete(String id) {
        orderTrackRepository.delete(id);
    }

    @Override
    public List<MOrderTrack> find(Map params) {
        return orderTrackRepository.findAll(createSpecification(params), new Sort("statusTime"));
    }

    @Override
    public long count(Map params) {
        return orderTrackRepository.count(createSpecification(params));
    }

    @Override
    public Page<MOrderTrack> findPage(Map params, Pageable pageable) {
        Page<MOrderTrack> page = orderTrackRepository.findAll(createSpecification(params), pageable);
        return page;
    }

    public static Specification createSpecification(final Map params) {
        return new Specification<MOrderTrack>() {
            @Override
            public Predicate toPredicate(Root<MOrderTrack> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList();
                if (params.get("orderNum") != null && !"".equals(params.get("orderNum"))) {
                    list.add(cb.equal(root.get("orderNum").as(String.class), params.get("orderNum").toString()));
                }
                return cb.and(list.toArray(new Predicate[0]));
            }
        };
    }
}
