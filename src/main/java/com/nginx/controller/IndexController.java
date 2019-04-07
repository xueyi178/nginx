package com.nginx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 1、跳转页面
 * 项目名称：springboo-nginx 
 * 类名称：IndexController
 * 开发者：Lenovo
 * 开发时间：2019年4月7日下午6:00:22
 */
@EnableAutoConfiguration
@RestController
public class IndexController {
	@Value("${server.port}")
	private String port;

	@RequestMapping("/")
	public String index() {
		return "springboot2.0:" + port;
	}

	public static void main(String[] args) {
		SpringApplication.run(IndexController.class, args);
	}
}
