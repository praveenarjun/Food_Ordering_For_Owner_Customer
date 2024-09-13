package com.praveen.request;

import com.praveen.model.Category;
import com.praveen.model.IngredientsItem;
import lombok.Data;

import java.util.List;

@Data
public class createFoodRequest {
    private String name;
    private String description;
    private Long price;

    private Category category;
    private List<String> images;

    private Long restaurantId;
    private boolean vegetarian;
    private boolean seasonal;
    private List<IngredientsItem> ingredients;
}
