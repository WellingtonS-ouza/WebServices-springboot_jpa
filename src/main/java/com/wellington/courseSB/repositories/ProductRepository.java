package com.wellington.courseSB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.courseSB.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
