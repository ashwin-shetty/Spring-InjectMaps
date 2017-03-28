package com.ashu.springdemo.test;
import com.ashu.springdemo.service.MapImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MapTestMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		MapImpl dao =ctx.getBean("mapImpl",MapImpl.class);		
		dao.readMap();
		
	}
	
}
