package com.panasonic.cisc.ciscap.drms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.panasonic.cisc.ciscap.drms.controller.MainController;


@Component
public class Sample{

	@Autowired
	private MainController mainController;
	
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:com/panasonic/cisc/ciscap/drms/config/service-context.xml");
		
		Sample main = context.getBean(Sample.class); 

		//MainController mainController = new MainController();
		main.mainController.start();
		
	}
}

