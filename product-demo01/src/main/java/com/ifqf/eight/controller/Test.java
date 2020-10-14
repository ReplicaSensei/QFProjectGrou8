package com.ifqf.eight.controller;

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
    @GetMapping("/test")
    public Map<String,Object>test(){
        Map<String,Object>map = new HashMap<>();
        map.put("msg", "demodong");
        return map;
    }
}
