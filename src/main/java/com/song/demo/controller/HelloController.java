package com.song.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : songwanning
 * @date : 2020/1/8 16:18
 */
@RestController
@RequestMapping("test")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
