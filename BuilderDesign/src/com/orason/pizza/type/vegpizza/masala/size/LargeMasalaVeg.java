package com.orason.pizza.type.vegpizza.masala.size;

import com.orason.pizza.type.vegpizza.VegPizza;

public class LargeMasalaVeg extends VegPizza {

    @Override
    public float price() {
        return 150.0f;
    }

    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Large Size";
    }

}