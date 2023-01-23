package org.example;

import Classes.Menu;
import Classes.Pizzeria;
import Classes.Sushi;
import Enums.TypeOfItems;
import Enums.TypeOfKitchen;


import static Enums.TypeOfItems.drinks;
import static Enums.TypeOfItems.food;

public class Main {
    public static void main(String[] args) {
        //italian cuisine
        Menu italian = new Menu();
        italian.addItem(food, "Francescana pizza", 10.50);
        italian.addItem(drinks, "Coca-cola", 2.0);
        italian.addItem(food, "Margherita pizza", 8.20);
        italian.addItem(drinks, "Fanta", 1.55);

        Pizzeria PizzaAndPan = new Pizzeria("PizzaAndPan", 100000,4, TypeOfKitchen.italian,
                "Tallinn", 9.8, true, italian);

        double sum = PizzaAndPan.getProductSum();
        System.out.println(sum);

        Pizzeria DaVinci = new Pizzeria("DaVinci", 88000, 5, TypeOfKitchen.italian,
                "Tartu", 5.7, false, italian);
        double sum1= DaVinci.getProductSum();
        System.out.println(sum1);



        Menu japanese = new Menu();
        japanese.addItem(food, "Maki", 12.40);
        japanese.addItem(drinks, "Tea", 3.00);
        Sushi LittleJapan = new Sushi("LittleJapan", 46700, 6, TypeOfKitchen.japanese,
                "Viljandi", 6.8, true, japanese);

        double sum3=LittleJapan.getProductSum();
        System.out.println(sum3);
    }
}