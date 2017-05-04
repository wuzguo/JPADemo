package com.github.wuzguo.datasync.repository;


import com.github.wuzguo.datasync.entity.OrderTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderTrackRepository extends JpaRepository<OrderTrack, String>, JpaSpecificationExecutor<OrderTrack>{


}
