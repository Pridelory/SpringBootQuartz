package com.wangmeng.springbootquartz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.wangmeng.springbootquartz")
@MapperScan("com.wangmeng.springbootquartz.dao")
@SpringBootApplication
public class SpringbootquartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootquartzApplication.class, args);
	}

}
