package com.ifqf.eight.controller;

import com.ifqf.eight.entity.Product;
import com.ifqf.eight.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/findAll")
    public Map<String, Object> test(@RequestParam Integer tid) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("data", productService.selectByTid(tid));
        return map;
    }

    @PostMapping("/addProduct")
    public Map<String, Object> test(@Valid Product product) {
        Map<String, Object> map = new HashMap<>();
        productService.addProduct(product);
        System.out.println(product);
        map.put("code", 200);
        map.put("msg", "success");
        map.put("data", product);
        return map;
    }
}