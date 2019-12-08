package com.orason.pizza.type.vegpizza.cheese.size;

import com.orason.pizza.type.vegpizza.VegPizza;

public class SmallCheeseVeg extends VegPizza {

    @Override
    public float price(){
        return 170.0f;
    }

    @Override
    public String name(){
        return "Cheese Pizza";
    }

    @Override
    public String size(){
        return "Small size";
    }
}