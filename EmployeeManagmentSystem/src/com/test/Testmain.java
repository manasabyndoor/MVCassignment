package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.displatinterface.Display;
import com.pojo.Employee;

public class Testmain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Display display=(Display) context.getBean("display");
	
 display.displaydata();
	}

}
