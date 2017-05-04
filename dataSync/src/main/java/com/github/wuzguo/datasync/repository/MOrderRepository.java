package com.github.wuzguo.datasync.repository;


import com.github.wuzguo.datasync.entity.MOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MOrderRepository extends JpaRepository<MOrder, String>, JpaSpecificationExecutor<MOrder>{


}
