package com.orason.pizza;

import com.orason.Order;

public abstract class Pizza implements Order {

    @Override
    public abstract float price();

}