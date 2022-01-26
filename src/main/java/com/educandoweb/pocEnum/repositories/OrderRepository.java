package com.educandoweb.pocEnum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.pocEnum.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
