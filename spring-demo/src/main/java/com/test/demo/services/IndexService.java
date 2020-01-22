package com.test.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexService {

	@Autowired
	UserService userService;

	public IndexService(){
		System.out.println("constructor from indexService");
	}


	public void getService(){
		System.out.println(userService);
	}
}
