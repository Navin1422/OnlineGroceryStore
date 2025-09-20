package com.grocery.service;

import com.grocery.model.Cart;

import java.util.HashMap;

public class CartService {

    // For now, in-memory cart
    private Cart cart;

    public CartService() {
        // Empty constructor
    }

    public Cart loadCart(int userId) {
        // For now, return empty cart
        return new Cart(userId);
    }

    public void saveCart(Cart cart) {
        // For now, do nothing. Later you can integrate with DB.
    }
}
