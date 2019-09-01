package cn.itcast.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= {"cn.itcast.jdbc.controller","cn.itcast.jdbc.service"})
@EnableAutoConfiguration
public class JdbcApp {
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcApp.class, args);
	}

}
