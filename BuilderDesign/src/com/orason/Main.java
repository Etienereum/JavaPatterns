package com.orason;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        OrderedBuilder builder=new OrderedBuilder();

        OrderedItems orderedItems=builder.preparePizza();

        orderedItems.showItems();

        System.out.println("\n");
        System.out.println("Total Cost : "+ orderedItems.getCost());

    }
}
