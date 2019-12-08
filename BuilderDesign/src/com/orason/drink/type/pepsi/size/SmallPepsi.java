package com.orason.drink.type.pepsi.size;

import com.orason.drink.type.pepsi.Pepsi;

public class SmallPepsi  extends Pepsi {

    @Override
    public String name() {
        return "300ml Pepsi";
    }

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String size() {
        return "Small Size";
    }
}