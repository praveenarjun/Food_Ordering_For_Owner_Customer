package com.praveen.service;

import com.praveen.model.CartItem;

public interface CartService {
    public CartItem addItemToCart(AddCartItemRequest req,String jwt) throws Exception;


}
