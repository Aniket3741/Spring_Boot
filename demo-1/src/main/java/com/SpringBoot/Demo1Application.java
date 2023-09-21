package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(Demo1Application.class, args);
		System.out.println("Hii ANIKET SINGH");
		
		SpringBootBean bn=con.getBean(SpringBootBean.class);
		bn.display();
	}

}
