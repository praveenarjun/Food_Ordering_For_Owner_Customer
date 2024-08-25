package com.praveen.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.praveen.dto.RestaurantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;


    private USER_ROLE role=USER_ROLE.ROLE_CUSTOMER;

    @JsonIgnore // Ignoring the order data when we are using user data
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer") //it is one to many between user and order

    private List<Order> orders = new ArrayList<>();

    @ElementCollection
    private List<RestaurantDto>favorites = new ArrayList();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) //after deleting the user the address also automatically deleted

    private List<Address> addresses = new ArrayList<>();
}
