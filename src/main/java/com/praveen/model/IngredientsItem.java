package com.praveen.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class IngredientsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne //many ingredients can be in one category
    private IngredientCategory category;

    @JsonIgnore
    @ManyToOne //many ingredients can be in one restaurant
    private Restaurant restaurant;

    private boolean inStoke = true;

}
