package com.orason.decorator;

import com.orason.Food;

public class FoodDecorator implements Food {

    public Food newFood;

    public FoodDecorator(Food newFood)  {
        this.newFood = newFood;
    }

    public String prepareFood(){
        return newFood.prepareFood();
    }

    public double foodPrice(){
        return newFood.foodPrice();
    }
}
