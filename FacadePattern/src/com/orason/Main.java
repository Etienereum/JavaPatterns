package com.orason;

import com.orason.mobileShop.keeper.Shopkeeper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int  choice;

    public static void main(String args[]) throws NumberFormatException, IOException{
        do{
            System.out.print("====== Mobile Shop ======== \n");
            System.out.print("                            \n");
            System.out.print("    1. IPHONE.              \n");
            System.out.print("    2. SAMSUNG.             \n");
            System.out.print("    3. BLACKBERRY.          \n");
            System.out.print("    4. Exit.                \n");
            System.out.print("                            \n");
            System.out.print(" *** Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());

//            Shopkeeper sk = new Shopkeeper();

            switch (choice) {
                case 1: {
                    Shopkeeper sk = new Shopkeeper();
                    sk.iphoneSales();
                } break;

                case 2: {
                    Shopkeeper sk = new Shopkeeper();
                    sk.samsungSales();
                } break;

                case 3: {
                    Shopkeeper sk = new Shopkeeper();
                    sk.blackberrySales();
                } break;

                default: {
                    System.out.println(" *** You purchased Nothing *** ");
                }

                return;
            }
        }while(choice!=4);
    }
}