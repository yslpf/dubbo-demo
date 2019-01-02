package com.test.provider;
 
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Provider {
	// start provider
	static{
		PropertyConfigurator.configure("src/main/resources/log4.properties");
	}
	public static void main(String args[]) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/*.xml");
		context.start();
		System.in.read();
	}
}
