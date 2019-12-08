package com.orason.pizza.type.nonvegpizza;

import com.orason.pizza.Pizza;

public abstract class NonVegPizza extends Pizza{

    public abstract String name();

    public abstract String size();

    @Override
    public abstract float price();

}