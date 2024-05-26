package com.jxm.sideline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jxm.sideline.model.mapper")
public class SidelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidelineApplication.class, args);
	}

}
