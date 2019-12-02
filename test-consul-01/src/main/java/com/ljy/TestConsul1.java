package com.ljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
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
@EnableScheduling
public class TestConsul1 {
    public static void main(String[] args){
        SpringApplication.run(TestConsul1.class);
    }

    @RequestMapping("/testHelth")
    public String testHelth() {
        return "ok_";
    }

}
