package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.user","com.GeneralServices","com.geoLoc","com.blog"})
public class GagBikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GagBikeApplication.class, args);
	}

}
