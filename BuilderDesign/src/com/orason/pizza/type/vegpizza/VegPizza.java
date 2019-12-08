package com.orason.pizza.type.vegpizza;

import com.orason.pizza.Pizza;

public abstract class VegPizza extends Pizza {

    public abstract String name();

    public abstract String size();

    @Override
    public abstract float price();

}

