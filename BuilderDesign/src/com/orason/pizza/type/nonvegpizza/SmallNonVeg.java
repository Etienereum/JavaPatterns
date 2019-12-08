package com.orason.pizza.type.nonvegpizza;

import com.orason.pizza.type.nonvegpizza.NonVegPizza;

public class SmallNonVeg extends NonVegPizza {

    @Override
    public float price(){
        return 100.0f;
    }

    @Override
    public String name(){
        return "Non-Veg Pizza";
    }

    @Override
    public String size(){
        return "Small size";
    }
}