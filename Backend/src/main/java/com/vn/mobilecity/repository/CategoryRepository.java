package com.vn.mobilecity.repository;

import com.vn.mobilecity.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query(value = "SELECT * FROM categories WHERE name = ?1", nativeQuery = true)
    Category findByCategoryName(String name);
}
