package com.orason.pizza.type.vegpizza.cheese.size;

import com.orason.pizza.type.vegpizza.VegPizza;

public class ExtraLargeCheeseVeg extends VegPizza {

    @Override
    public float price() {
        return 300.f;
    }

    @Override
    public String name() {
        return  "Cheese Pizza";
    }

    @Override
    public String size() {
        return "Extra-Large Size";
    }

}