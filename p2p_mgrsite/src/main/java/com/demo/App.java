package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= {"com.demo.p2p.base.mapper","com.demo.p2p.mgrsite.listener"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class,args);
	}
}
