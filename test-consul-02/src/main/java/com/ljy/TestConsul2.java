package com.ljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy
 * @作者:
 * @创建时间: 2019-12-01 21:07
 * @描述:
 **/
@SpringBootApplication
@RestController
public class TestConsul2 {
    public static void main(String[] args){
        SpringApplication.run(TestConsul2.class);
    }

    @RequestMapping("/testHelth")
    public String testHelth() {
        return "ok_";
    }

}
