package com.praveen.service;

import com.praveen.model.Category;
import com.praveen.model.Food;
import com.praveen.model.Restaurant;
import com.praveen.request.createFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(createFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;

    public List<Food> getRestaurantFoods(Long restaurantId,
                                         boolean isVegetarian,
                                         boolean isNonVeg,
                                         boolean isSeasonal,
                                         String foodCategory
    );

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId) throws Exception;

    public Food updateAvaliabilityStatus(Long foodId) throws Exception;

}
