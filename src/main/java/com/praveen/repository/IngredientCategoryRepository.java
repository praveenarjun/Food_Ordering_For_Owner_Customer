package com.praveen.repository;

import com.praveen.model.IngredientCategory;
import com.praveen.model.IngredientsItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientCategoryRepository extends JpaRepository<IngredientCategory,Long> {
    List<IngredientCategory> findByRestaurantId(Long id);
}
