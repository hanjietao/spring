package com.test.demo;

import com.test.demo.config.Appconfig;
import com.test.demo.services.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class Demo {

	public static void main(String[] args) {
		// 初始化Spring容器
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);

		ac.getBean(IndexService.class).getService();

		/*AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext();
		aac.register(UserDao.class);
		aac.refresh();
		UserDao userDao = aac.getBean(UserDao.class);
		userDao.query();*/
	}

}
