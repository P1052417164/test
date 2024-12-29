package com.duhui.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DhtestController {

    @RequestMapping("/test")
    public Map<String, Object> test() {

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("aa", "aa");
        return result;
    }
}
