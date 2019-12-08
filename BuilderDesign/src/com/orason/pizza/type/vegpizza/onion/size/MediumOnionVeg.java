package com.orason.pizza.type.vegpizza.onion.size;

import com.orason.pizza.type.vegpizza.VegPizza;

public class MediumOnionVeg extends VegPizza {

    @Override
    public float price() {
        return  150.f;
    }

    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Medium Size";
    }
}