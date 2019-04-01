package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by My on 2019/4/1.
 */
@RestController
public class HelloSpringBootController {
    @RequestMapping("/hello")
    public String hello() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        return list.get(0);
    }
}
