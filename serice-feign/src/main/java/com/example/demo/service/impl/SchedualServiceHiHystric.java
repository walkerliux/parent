package com.example.demo.service.impl;

import com.example.demo.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/20 0020.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
