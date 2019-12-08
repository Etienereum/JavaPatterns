package com.orason.drink.type.pepsi;

import com.orason.drink.ColdDrink;

public abstract class Pepsi extends ColdDrink {

    public abstract  String name();

    public abstract  String size();

    @Override
    public abstract  float price();

}