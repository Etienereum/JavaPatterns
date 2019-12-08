package com.orason.drink.type.pepsi.size;

import com.orason.drink.type.pepsi.Pepsi;

public class MediumPepsi extends Pepsi {

    @Override
    public String name() {
        return "500ml Pepsi";
    }

    @Override
    public String size() {
        return "Medium Size";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}