package com.example.springbootdemo1.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//这里注意在用@ConfigurationProperties这个注解的时候可能有大量的对象。我们想指定注入哪个叫指定yml中的前缀也就是key
//当在实体类中使用@ConfigurationProperties上面爆红可以引入依赖
/**
 *          <dependency>
 *             <groupId>org.springframework.boot</groupId>
 *             <artifactId>spring-boot-configuration-processor</artifactId>
 *         </dependency>
 */
@ConfigurationProperties(prefix = "persion2")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persion {
    private String name;
    private int age;
}
