package com.github.wuzguo.datasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;

/**
 * 启动类
 *
 * @author wzguo
 * @date 2016年11月26日 下午3:24:04
 */
@ComponentScan(basePackages = {"com.github.wuzguo.datasync"})
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.github.wuzguo.datasync.repository"})
@EntityScan(basePackages = {"com.github.wuzguo.datasync.entity"})
@EnableJms
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}