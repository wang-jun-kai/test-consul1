package com.ljy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy.controller
 * @作者:
 * @创建时间: 2019-12-02 07:58
 * @描述:
 **/
@RestController
@RefreshScope
public class TestController {

    @Value("${test.uu}")
    private String uu;

    @Value("${test.yy}")
    private String yy;

    @RequestMapping("test01")
    public String test01() {
        return uu+"-----------"+yy;
    }
}
