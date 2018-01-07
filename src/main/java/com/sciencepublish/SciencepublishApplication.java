package com.sciencepublish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.sciencepublish.mapper")
@ComponentScan(basePackages={"com.sciencepublish"})
public class SciencepublishApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SciencepublishApplication.class, args);
    }
}
