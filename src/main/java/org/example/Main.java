package org.example;

import Classes.Menu;
import Classes.Pizzeria;
import Enums.TypeOfItems;
import Enums.TypeOfKitchen;


import static Enums.TypeOfItems.drinks;
import static Enums.TypeOfItems.food;

public class Main {
    public static void main(String[] args) {
        //italian cuisine
        Menu italian = new Menu();
        italian.addItem(food, "Franzescana pizza", 10.0);
        italian.addItem(drinks, "Coca-cola", 2.0);

        Pizzeria americanaPizzeria = new Pizzeria("Pizza&Pan", 100000,4, TypeOfKitchen.italian,
                "Tallinn", 9.8, true, italian);

        double sum = americanaPizzeria.getProductSum();
        System.out.println(sum);


    }
}