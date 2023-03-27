package com.wellington.courseSB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.courseSB.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
