package com.trungtamjava.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.trungtamjava.model.Order;
import com.trungtamjava.model.Person;

// cho spring biet day la file cau hinh
@Configuration

// cho phep spring su dung cac the annotation de cau hinh. tuong duong voi <mvc:annotation-driven />
@EnableWebMvc

// chi dinh noi de quet package
@ComponentScan(basePackages="com.trungtamjava.spring")
public class HelloWorldConfiguration {
	@Bean    
	public ViewResolver viewResolver() {        
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();        
		viewResolver.setViewClass(JstlView.class);        
		viewResolver.setPrefix("/WEB-INF/views/");        
		viewResolver.setSuffix(".jsp");         
		return viewResolver;    
	}
	
	
	//khởi tạo bean. nếu không đặt tên thì tên bean sẽ là tên phương thức person()
	@Bean(name="person",initMethod="init",destroyMethod="destroy")
	//chỉ định kiểu của bean loại gì.
	@Scope("prototype")
	public Person person() {
		Person person=new Person("trung tam java", 12);
		return person;
	}
	
	@Bean(name="person2")
	public Person person2() {
		Person person=new Person("trung tam java", 11);
		return person;
	}
	
	// tạo bean order vào truyền bean person đã tạo vào
	
	/*
	 * @Bean public Order order() { return new Order(person()); }
	 */
	// cách 2 sử dụng autowrite . sẽ tự động tìm bean có person và gán vào
	
	@Bean
	@Autowired
	//chỉ rõ bean person nào sẽ được tự động gán
	@Qualifier("person2")
	public Order order(Person person) {
		return new Order(person);
	}
}
