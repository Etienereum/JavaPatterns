package com.orason.pizza.type.vegpizza.masala.size;

import com.orason.pizza.type.vegpizza.VegPizza;

public class SmallMasalaVeg extends VegPizza {

    @Override
    public float price(){
        return 100.0f;
    }

    @Override
    public String name(){
        return "Masala Pizza";
    }

    @Override
    public String size(){
        return "Small size";
    }
}