package com.github.wuzguo.datasync.repository;


import com.github.wuzguo.datasync.entity.MOrderTrack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MOrderTrackRepository extends JpaRepository<MOrderTrack, String>, JpaSpecificationExecutor<MOrderTrack>{


}
