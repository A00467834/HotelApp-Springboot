package com.springbootassignment.hotelApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.springbootassignment.hotelApp.data.entities")
@SpringBootApplication
public class HotelAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelAppApplication.class, args);
	}

}
