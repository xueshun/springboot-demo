package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 
 * @author xueshun
 * extends WebMvcConfigurerAdapter
 */
@SpringBootApplication
public class DemoApplication {
	
	/*@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		
		//[1] 需要先定义一个Convert 转化消息的对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		
		//[2] 添加fastJson 配置消息，比如：是否需要格式化返回的json数据
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		 //处理中文乱码问题
        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastConverter.setSupportedMediaTypes(fastMediaTypes);
	
		//[3] 在convert中添加配置消息
		fastConverter.setFastJsonConfig(fastJsonConfig);
		
		//[4] 将convert添加到converters
		converters.add(fastConverter);
	}*/
	
	/**
	 * 第二种方式注入
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		//[1] 需要先定义一个Convert 转化消息的对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		
		//[2] 添加fastJson 配置消息，比如：是否需要格式化返回的json数据
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		
		 //处理中文乱码问题
        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastConverter.setSupportedMediaTypes(fastMediaTypes);
        
		//[3] 在convert中添加配置消息
		fastConverter.setFastJsonConfig(fastJsonConfig);
		
		//[4] 将fastConverter添加到converter
		HttpMessageConverter<?> converter = fastConverter;
		
		return new HttpMessageConverters(converter);
	}

	
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
	}
}
