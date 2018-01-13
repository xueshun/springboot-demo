package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
