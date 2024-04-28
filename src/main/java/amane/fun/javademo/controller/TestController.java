package amane.fun.javademo.controller;

import amane.fun.javademo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestMapper testMapper;

    @GetMapping("/test")
    public String queryXjc(){
        return testMapper.queryXjc();
    }
}
