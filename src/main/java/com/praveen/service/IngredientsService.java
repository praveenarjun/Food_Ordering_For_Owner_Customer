package com.praveen.service;

import com.praveen.model.IngredientCategory;
import com.praveen.model.IngredientsItem;

import java.util.List;

public interface IngredientsService {

    public IngredientCategory createIngredientCategory(String name,Long restaurantId) throws Exception;

    public IngredientCategory findIngredientCategoryById(Long id) throws Exception;

    public List<IngredientCategory> findIngredientCategoryByRestaurantId(Long id) throws Exception;

    public List<IngredientsItem> findRestaurantIngredients(Long restaurantId) throws Exception;

    public IngredientsItem createIngredientItem(Long restaurantId,String ingredientName,Long categoryId) throws Exception;

    public IngredientsItem updateStock(long id) throws Exception;



}
