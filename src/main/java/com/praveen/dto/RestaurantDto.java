package com.praveen.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Embeddable
public class RestaurantDto {

    private String title;

    @Column(length = 1000)
    private String images; // Store images as a single string with a delimiter

    private String description;
    private Long id;

    // Getter for images as List<String>
    public List<String> getImages() {
        return Arrays.stream(images.split(","))
                .collect(Collectors.toList());
    }

    // Setter for images from List<String>
    public void setImages(List<String> images) {
        this.images = String.join(",", images);
    }
}