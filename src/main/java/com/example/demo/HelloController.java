package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

/**
 * 在这里使用RestController  （等待于 @Controller 和 @RequestBody）
 * @author xueshun
 *
 */
@RestController
public class HelloController {
	
	/**
	 * 在这里我们使用@RequestMapping 建立请求映射:
	 * http://127.0.0.1:8080/hello
	 * @return
	 */
	@RequestMapping(value="/hello")
	public String hello() {
		return "hello";
	}
	
	/**
	 * Spring Boot默认使用的json解析框架是jackson
	 * @return
	 */
	@RequestMapping(value="/getStudent")
	public Student getStudent() {
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("张三试试111");
		s1.setCreateTime(new Date());
		s1.setRemark("这是一个备注信息！！！");
		return s1;
	}
}
