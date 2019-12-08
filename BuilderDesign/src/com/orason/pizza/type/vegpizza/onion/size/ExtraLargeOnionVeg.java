package com.orason.pizza.type.vegpizza.onion.size;

import com.orason.pizza.type.vegpizza.VegPizza;

public class ExtraLargeOnionVeg extends VegPizza {

    @Override
    public float price() {
        return 200.f;
    }

    @Override
    public String name() {
        return  "Onion Pizza";
    }

    @Override
    public String size() {
        return "Extra-Large Size";
    }

}