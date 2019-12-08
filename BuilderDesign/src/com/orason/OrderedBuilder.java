package com.orason;

import com.orason.drink.type.coke.size.LargeCoke;
import com.orason.drink.type.coke.size.MediumCoke;
import com.orason.drink.type.coke.size.SmallCoke;
import com.orason.drink.type.pepsi.size.LargePepsi;
import com.orason.drink.type.pepsi.size.MediumPepsi;
import com.orason.drink.type.pepsi.size.SmallPepsi;
import com.orason.pizza.type.nonvegpizza.ExtraLargeNonVeg;
import com.orason.pizza.type.nonvegpizza.LargeNonVeg;
import com.orason.pizza.type.nonvegpizza.MediumNonVeg;
import com.orason.pizza.type.nonvegpizza.SmallNonVeg;
import com.orason.pizza.type.vegpizza.cheese.size.ExtraLargeCheeseVeg;
import com.orason.pizza.type.vegpizza.cheese.size.LargeCheeseVeg;
import com.orason.pizza.type.vegpizza.cheese.size.MediumCheeseVeg;
import com.orason.pizza.type.vegpizza.cheese.size.SmallCheeseVeg;
import com.orason.pizza.type.vegpizza.masala.size.ExtraLargeMasalaVeg;
import com.orason.pizza.type.vegpizza.masala.size.LargeMasalaVeg;
import com.orason.pizza.type.vegpizza.masala.size.MediumMasalaVeg;
import com.orason.pizza.type.vegpizza.masala.size.SmallMasalaVeg;
import com.orason.pizza.type.vegpizza.onion.size.ExtraLargeOnionVeg;
import com.orason.pizza.type.vegpizza.onion.size.LargeOnionVeg;
import com.orason.pizza.type.vegpizza.onion.size.MediumOnionVeg;
import com.orason.pizza.type.vegpizza.onion.size.SmallOnionVeg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderedBuilder {

    public OrderedItems preparePizza() throws IOException {

        OrderedItems itemsOrder = new OrderedItems();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter Number Code of the Pizza of your choice ");
        System.out.println("===============================================");
        System.out.println("        1. Veg-Pizza                           ");
        System.out.println("        2. Non-Veg Pizza                       ");
        System.out.println("        3. Exit                                ");
        System.out.println("===============================================");

        int pizzaColdDrinkChoice = Integer.parseInt(br.readLine());

        switch (pizzaColdDrinkChoice) {

            case 1: {

                System.out.println("You ordered Veg Pizza");
                System.out.println("\n");
                System.out.println(" Enter the types of Veg-Pizza ");
                System.out.println("------------------------------");
                System.out.println("        1.Cheese Pizza        ");
                System.out.println("        2.Onion Pizza         ");
                System.out.println("        3.Masala Pizza        ");
                System.out.println("        4.Exit                ");
                System.out.println("------------------------------");

                int vegpizzachoice = Integer.parseInt(br.readLine());

                switch (vegpizzachoice) {

                    case 1: {
                        System.out.println("You ordered Cheese Pizza");
                        System.out.println("\n");
                        System.out.println("Enter the cheese pizza size");
                        System.out.println("------------------------------------");
                        System.out.println("    1. Small Cheese Pizza ");
                        System.out.println("    2. Medium Cheese Pizza ");
                        System.out.println("    3. Large Cheese Pizza ");
                        System.out.println("    4. Extra-Large Cheese Pizza ");
                        System.out.println("------------------------------------");

                        int cheezepizzasize = Integer.parseInt(br.readLine());

                        switch (cheezepizzasize) {
                            case 1:
                                itemsOrder.addItems(new SmallCheeseVeg());
                                break;
                            case 2:
                                itemsOrder.addItems(new MediumCheeseVeg());
                                break;
                            case 3:
                                itemsOrder.addItems(new LargeCheeseVeg());
                                break;
                            case 4:
                                itemsOrder.addItems(new ExtraLargeCheeseVeg());
                                break;
                        }
                    } break;

                    case 2: {
                        System.out.println("You ordered Onion Pizza");
                        System.out.println("\n");
                        System.out.println("Enter the Onion pizza size");
                        System.out.println("----------------------------------");
                        System.out.println("    1. Small Onion Pizza ");
                        System.out.println("    2. Medium Onion Pizza ");
                        System.out.println("    3. Large Onion Pizza ");
                        System.out.println("    4. Extra-Large Onion Pizza ");
                        System.out.println("----------------------------------");

                        int onionpizzasize = Integer.parseInt(br.readLine());

                        switch (onionpizzasize) {

                            case 1:
                                itemsOrder.addItems(new SmallOnionVeg());
                                break;

                                case 2:
                                    itemsOrder.addItems(new MediumOnionVeg());
                                        break;

                                        case 3:
                                            itemsOrder.addItems(new LargeOnionVeg());
                                            break;

                                            case 4:
                                                itemsOrder.addItems(new ExtraLargeOnionVeg());
                                                break;
                        }
                    } break;

                    case 3: {
                        System.out.println("You ordered Masala Pizza");
                        System.out.println("\n");
                        System.out.println("Enter the Masala pizza size");
                        System.out.println("------------------------------------");
                        System.out.println("    1. Small Masala Pizza ");
                        System.out.println("    2. Medium Masala Pizza ");
                        System.out.println("    3. Large Masala Pizza ");
                        System.out.println("    4. Extra-Large Masala Pizza ");
                        System.out.println("------------------------------------");

                        int masalaPizzaSize = Integer.parseInt(br.readLine());

                        switch (masalaPizzaSize) {
                            case 1:
                                itemsOrder.addItems(new SmallMasalaVeg());
                                break;

                                case 2:
                                    itemsOrder.addItems(new MediumMasalaVeg());
                                    break;

                                    case 3:
                                        itemsOrder.addItems(new LargeMasalaVeg());
                                        break;

                                        case 4:
                                            itemsOrder.addItems(new ExtraLargeMasalaVeg());
                                            break;
                        }
                    } break;
                }

            } break;// Veg- pizza choice completed.

            case 2: {
                System.out.println("You ordered Non-Veg Pizza");
                System.out.println("\n");
                System.out.println(" Enter the Non-Veg pizza size     ");
                System.out.println("----------------------------------");
                System.out.println("    1. Small Non-Veg  Pizza       ");
                System.out.println("    2. Medium Non-Veg  Pizza      ");
                System.out.println("    3. Large Non-Veg  Pizza       ");
                System.out.println("    4. Extra-Large Non-Veg  Pizza ");
                System.out.println("----------------------------------");

                int nonvegpizzasize = Integer.parseInt(br.readLine());

                switch (nonvegpizzasize) {

                    case 1:
                        itemsOrder.addItems(new SmallNonVeg());
                        break;

                        case 2:
                            itemsOrder.addItems(new MediumNonVeg());
                            break;

                            case 3:
                                itemsOrder.addItems(new LargeNonVeg());
                                break;

                                case 4:
                                    itemsOrder.addItems(new ExtraLargeNonVeg());
                                    break;
                }

            } break;
            default: { break; }

        }//end of main Switch

        // continued?...
        System.out.println(" Enter the choice of your ColdDrink ");
        System.out.println("====================================");
        System.out.println("        1. Pepsi                    ");
        System.out.println("        2. Coke                     ");
        System.out.println("        3. Exit                     ");
        System.out.println("====================================");

        int coldDrink = Integer.parseInt(br.readLine());

        switch (coldDrink) {

            case 1: {
                System.out.println("You ordered Pepsi ");
                System.out.println("\n");
                System.out.println("Enter the  Pepsi Size ");
                System.out.println("------------------------");
                System.out.println("    1. Small Pepsi ");
                System.out.println("    2. Medium Pepsi ");
                System.out.println("    3. Large Pepsi ");
                System.out.println("------------------------");

                int pepsiSize = Integer.parseInt(br.readLine());

                switch (pepsiSize) {

                    case 1:
                        itemsOrder.addItems(new SmallPepsi());
                        break;

                        case 2:
                            itemsOrder.addItems(new MediumPepsi());
                            break;

                            case 3:
                                itemsOrder.addItems(new LargePepsi());
                                break;

                }
            } break;

            case 2: {
                System.out.println("You ordered Coke");
                System.out.println("\n");
                System.out.println("Enter the Coke Size");
                System.out.println("------------------------");
                System.out.println("    1. Small Coke ");
                System.out.println("    2. Medium Coke  ");
                System.out.println("    3. Large Coke  ");
                System.out.println("    4. Extra-Large Coke ");
                System.out.println("------------------------");

                int cokeSize = Integer.parseInt(br.readLine());

                switch (cokeSize) {
                    case 1:
                        itemsOrder.addItems(new SmallCoke());
                        break;

                        case 2:
                            itemsOrder.addItems(new MediumCoke());
                            break;

                            case 3:
                                itemsOrder.addItems(new LargeCoke());
                                break;
                }

            } break;

            default: { break; }
        }//End of the Cold-Drink switch
        return itemsOrder;
    }
}