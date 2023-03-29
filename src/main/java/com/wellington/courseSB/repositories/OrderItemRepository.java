package com.wellington.courseSB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.courseSB.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
