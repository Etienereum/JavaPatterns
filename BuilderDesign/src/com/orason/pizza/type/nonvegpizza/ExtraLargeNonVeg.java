package com.orason.pizza.type.nonvegpizza;

import com.orason.pizza.type.nonvegpizza.NonVegPizza;

public class ExtraLargeNonVeg extends NonVegPizza {

    @Override
    public float price() {
        return 250.f;
    }

    @Override
    public String name() {
        return  "Non-Veg Pizza";
    }

    @Override
    public String size() {
        return "Extra-Large Size";
    }

}