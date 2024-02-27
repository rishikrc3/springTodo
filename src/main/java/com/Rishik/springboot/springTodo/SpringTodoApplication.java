package com.Rishik.springboot.springTodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//This annotation is used to show that this is a spring boot application
@SpringBootApplication
public class SpringTodoApplication {

	public static void main(String[] args)
	{

		//This one line, this one magical line is used to start the spring boot application
		SpringApplication.run(SpringTodoApplication.class, args);
	}

}
