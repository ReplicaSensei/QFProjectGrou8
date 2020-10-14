package com.ifqf.eight.controller;

import com.ifqf.eight.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * author:demodong
 * 2020/10/13
 * 22:20
 */
@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    ProductService productService;

    @GetMapping("/test")
    public Map<String, Object> test() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("data", productService.selectByTid(1));
        return map;
    }
}