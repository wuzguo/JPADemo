package com.github.wuzguo.datasync.repository;


import com.github.wuzguo.datasync.entity.BureauCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Intellij IDEA 2016.2
 *
 * @描述 路局代码查询
 * @作者 wzguo
 * @版本 1.0.0
 * @日期 2016.12.02
 */
public interface BureauCodeRepository extends JpaRepository<BureauCode, String>, JpaSpecificationExecutor<BureauCode> {
}
