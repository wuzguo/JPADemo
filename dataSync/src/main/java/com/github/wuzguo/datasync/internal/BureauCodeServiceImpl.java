package com.github.wuzguo.datasync.internal;


import com.github.wuzguo.datasync.entity.BureauCode;
import com.github.wuzguo.datasync.entity.Message;
import com.github.wuzguo.datasync.repository.BureauCodeRepository;
import com.github.wuzguo.datasync.service.IBureauCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Intellij IDEA 2016.2
 *
 * @描述 代码字段转换Service
 * @作者 wzguo
 * @版本 1.0.0
 * @日期 2016.12.02
 */

@Service
public class BureauCodeServiceImpl implements IBureauCodeService {

    @Autowired
    private BureauCodeRepository bureauCodeRepository;

    @Override
    public BureauCode insert(BureauCode entity) {
        return bureauCodeRepository.save(entity);
    }

    @Override
    public BureauCode update(BureauCode entity) {
        return bureauCodeRepository.save(entity);
    }

    @Override
    public BureauCode save(BureauCode entity) {
        return bureauCodeRepository.save(entity);
    }

    @Override
    public BureauCode get(String s) {
        return bureauCodeRepository.findOne(s);
    }

    @Override
    public void delete(String s) {
        bureauCodeRepository.delete(s);
    }

    @Override
    public List<BureauCode> find(Map params) {
        return bureauCodeRepository.findAll(createSpecification(params));
    }

    @Override
    public long count(Map params) {
        return bureauCodeRepository.count(createSpecification(params));
    }

    @Override
    public Page<BureauCode> findPage(Map params, Pageable pageable) {
        Page<BureauCode> page = bureauCodeRepository.findAll(createSpecification(params), pageable);
        return page;
    }

    public static Specification createSpecification(Map params) {
        return new Specification<Message>() {
            @Override
            public Predicate toPredicate(Root<Message> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList();
                //cb.equal(root.get("").as(String.class), params.get("xxx"));
                return cb.and(list.toArray(new Predicate[0]));
            }
        };
    }
}
