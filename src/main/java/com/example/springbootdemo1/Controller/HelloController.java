package com.example.springbootdemo1.Controller;

import com.example.springbootdemo1.Pojo.Persion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //    取单个值
    @Value("${name}")
    private String name;
    //    取对象中的某个属性
    @Value("${persion.name}")
    private String name2;
    @Value("${persion.age}")
    private int age;
    //测试用${}赋值的对象   ======================================>测试项目报错原因是yml的空格问题。一点要注意空格的问题
    @Value("${persions.name}")
    private String namess;
    //数组的测试
    @Value("${adress[1]}")
    private String address1;
    //测试常量
    @Value("${msg1}")
    private String msg1;
    @Value("${msg2}")
    private String msg2;
    @Autowired
    private Environment env;
    @Autowired
    private Persion persion;
    //    测试请求
    @RequestMapping("/values")
    public String values() {
        System.out.println(address1);
        System.out.println(msg1 + msg2);
        System.out.println("============================>");
        System.out.println(env.getProperty("persion.name"));
        System.out.println(persion.toString());
        return name + name2 + age + namess;
    }

    @RequestMapping("/index")
    public String Hello() {
        return "hello";
    }
}
