package com.orason.pizza.type.vegpizza.cheese.size;

import com.orason.pizza.type.vegpizza.VegPizza;

public class LargeCheeseVeg extends VegPizza {

    @Override
    public float price() {
        return 260.0f;
    }

    @Override
    public String name() {
        return "Cheese Pizza";
    }

    @Override
    public String size() {
        return "Large Size";
    }

}