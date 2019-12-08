package com.orason.drink.type.coke.size;

import com.orason.drink.type.coke.Coke;

public class MediumCoke extends Coke {

    @Override
    public String name() {
        return "500ml Coke";
    }

    @Override
    public String size() {
        return "Medium Size";
    }

    @Override
    public float price() {
        return  35.0f;
    }
}