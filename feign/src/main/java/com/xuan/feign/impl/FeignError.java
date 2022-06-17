package com.xuan.feign.impl;

import com.xuan.entity.Student;
import com.xuan.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @version 1.0
 * @auther jiangning
 * @date 2022/6/16
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中·····";
    }
}
