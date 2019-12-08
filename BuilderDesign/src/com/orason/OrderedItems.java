package com.orason;

import java.util.ArrayList;
import java.util.List;

public class OrderedItems {

    List<Order> items=new ArrayList<Order>();

    public void addItems(Order item){
        items.add(item);
    }

    public float getCost(){

        float cost=0.0f;
        for (Order item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        for (Order item : items) {
            System.out.println("Order Item is: " + item.name());
            System.out.println("Size is:       " + item.size());
            System.out.println("Price is:      "+ item.price());

        }
    }

}