package com.github.wuzguo.datasync.internal;


import com.github.wuzguo.datasync.entity.Message;
import com.github.wuzguo.datasync.repository.MessageRepository;
import com.github.wuzguo.datasync.service.IMessageService;
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

@Service
public class MessageServiceImpl implements IMessageService {

    @Autowired
    private MessageRepository messageRepository;

    public long count() {
        return messageRepository.count();
    }

    @Override
    public Message insert(Message entity) {
        return messageRepository.save(entity);
    }

    @Override
    public Message update(Message entity) {
        return messageRepository.save(entity);
    }

    @Override
    public Message save(Message entity) {
        return messageRepository.save(entity);
    }

    @Override
    public Message get(Long id) {
        return messageRepository.findOne(id);
    }

    @Override
    public void delete(Long id) {
        messageRepository.delete(id);
    }

    @Override
    public List<Message> find(Map params) {
        return messageRepository.findAll(createSpecification(params));
    }

    @Override
    public long count(Map params) {
        return messageRepository.count(createSpecification(params));
    }

    @Override
    public Page<Message> findPage(Map params, Pageable pageable) {
        Page<Message> page = messageRepository.findAll(createSpecification(params), pageable);
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
