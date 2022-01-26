package com.educandoweb.pocEnum;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.educandoweb.pocEnum.entities.Order;
import com.educandoweb.pocEnum.enums.OrderStatus;
import com.educandoweb.pocEnum.repositories.OrderRepository;

@SpringBootApplication
public class PocEnumApplication implements CommandLineRunner {
	
	@Autowired
	private OrderRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(PocEnumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order o1 = new Order(null, Instant.parse("2022-01-20T19:48:07Z"), OrderStatus.WAITING_PAYMENT);
		Order o2 = new Order(null, Instant.parse("2022-01-23T22:05:07Z"), OrderStatus.PAID);
		Order o3 = new Order(null, Instant.parse("2022-01-23T22:05:07Z"), OrderStatus.DELIVERED);
		Order o4 = new Order(null, Instant.parse("2021-12-23T22:05:07Z"), OrderStatus.CANCELED);
		
		repository.saveAll(Arrays.asList(o1, o2, o3, o4));
		
	}

}
