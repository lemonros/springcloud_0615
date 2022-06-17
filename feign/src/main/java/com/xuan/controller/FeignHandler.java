package com.xuan.controller;

import com.xuan.entity.Student;
import com.xuan.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @version 1.0
 * @auther jiangning
 * @date 2022/6/16
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    private Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    private String index(){
        return  feignProviderClient.index();
    }
}
