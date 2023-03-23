package com.wellington.courseSB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.courseSB.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
