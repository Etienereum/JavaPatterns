package com.orason.pizza.type.vegpizza.onion.size;

import com.orason.pizza.type.vegpizza.VegPizza;

public class LargeOnionVeg extends VegPizza {

    @Override
    public float price() {
        return 180.0f;
    }

    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Large Size";
    }

}