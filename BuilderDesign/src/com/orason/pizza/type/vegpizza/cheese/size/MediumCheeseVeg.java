package com.orason.pizza.type.vegpizza.cheese.size;

import com.orason.pizza.type.vegpizza.VegPizza;

public class MediumCheeseVeg extends VegPizza {

    @Override
    public float price() {
        return  220.f;
    }

    @Override
    public String name() {
        return "Cheese Pizza";
    }

    @Override
    public String size() {
        return "Medium Size";
    }
}