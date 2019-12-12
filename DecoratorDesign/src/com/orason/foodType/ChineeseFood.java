package com.orason.foodType;

import com.orason.Food;
import com.orason.decorator.FoodDecorator;

public class ChineesFood extends FoodDecorator {

    public ChineesFood(Food newFood){
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood() + " With Fried Rice and Manchurian  ";
    }

    public double foodPrice(){
        return super.foodPrice() + 65.0;
    }
}
