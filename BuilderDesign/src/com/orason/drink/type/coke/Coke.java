package com.orason.drink.type.coke;

import com.orason.drink.ColdDrink;

public abstract class Coke  extends ColdDrink {

    public abstract  String name();

    public abstract  String size();

    @Override
    public abstract  float price();

}