package com.orason.pizza.type.vegpizza.onion.size;

import com.orason.pizza.type.vegpizza.VegPizza;

public class SmallOnionVeg extends VegPizza {

    @Override
    public float price(){
        return 120.0f;
    }

    @Override
    public String name(){
        return "Onion Pizza";
    }

    @Override
    public String size(){
        return "Small size";
    }
}