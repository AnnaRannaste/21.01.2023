package org.example;

import Classes.Ingredient;
import Classes.Menu;
import Classes.Pizzeria;
import Classes.Sushi;
import Enums.TypeOfItems;
import Enums.TypeOfKitchen;


import java.util.ArrayList;
import java.util.List;

import static Enums.TypeOfItems.drinks;
import static Enums.TypeOfItems.food;

public class Main {

    private static Double ingredients;

    public static double getSumOfIngredients(List<Ingredient> ingredients) {
        double sum = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            sum += ingredients.get(i).getPrice();
        }
        return sum;
    }

    public static void main(String[] args) {
        //Ingredients for Pizza Americana
        List<Ingredient> ingredientsForPizzaAmericana = new ArrayList<Ingredient>() {
            Ingredient cheese = new Ingredient("Cheese", 1);
            Ingredient mushrooms = new Ingredient("Mushrooms", 0.5);
            Ingredient pepperoni = new Ingredient("Pepperoni", 1.5);
            Ingredient tomatoSauce = new Ingredient("Tomato sauce", 0.25);
            Ingredient dough = new Ingredient("Dough", 0.25);
        };

        //Ingredients for Pizza Hawai
        List<Ingredient> ingredientsForPizzaHawai = new ArrayList<Ingredient>() {
            Ingredient cheese = new Ingredient("Cheese", 1);
            Ingredient pineapple = new Ingredient("Pineapple", 0.5);
            Ingredient chicken = new Ingredient("Chicken", 1.5);
            Ingredient tomatoSauce = new Ingredient("Tomato sauce", 0.25);
            Ingredient dough = new Ingredient("Dough", 0.25);
            Ingredient basil = new Ingredient("Basil", 0.25);
        };

        //ingredients for sushi
        List<Ingredient> ingredientsForSushi = new ArrayList<Ingredient>() {
            Ingredient rise = new Ingredient("Rise", 1);
            Ingredient cucumber = new Ingredient("Cucumber", 1.0);
            Ingredient salmon = new Ingredient("Salmon", 1.0);
            Ingredient avocado = new Ingredient("Avocado", 1.0);
            Ingredient cream = new Ingredient("Cream", 1.0);
        };

        //--------------------------------------------------------------------------------------------------------
        //Cuisines
        //italian
        Menu italian = new Menu();

        //italian.addItem(food, "pizza Americana", getSumOfIngredients(ingredientsForPizzaAmericana), ingredientsForPizzaAmericana);
        italian.addItem(food, "pizza Americana", 10.0, null);
        italian.addItem(drinks, "Coca-cola", 12.0, null);
        italian.addItem(food, "pizza Hawai", 1.0, null);
        italian.addItem(drinks, "Fanta", 1.55, null);

        //__________________________________________________________________________________________________________
        //japanese

        Menu japanese = new Menu();
        japanese.addItem(food, "Maki", 8.00, null);
        japanese.addItem(drinks, "Tea", 3.00, null);

        //---------------------------------------------------------------------------------------------------------
        //Restaurants
        Pizzeria PizzaAndPan = new Pizzeria("PizzaAndPan", 100000, 4, TypeOfKitchen.italian,
                "Tallinn", 9.8, true, italian);

        Pizzeria DaVinci = new Pizzeria("DaVinci", 88000, 5, TypeOfKitchen.italian,
                "Tartu", 5.7, false, italian);

        Sushi LittleJapan = new Sushi("LittleJapan", 46700, 6, TypeOfKitchen.japanese,
        "Viljandi",  6.8, true, japanese);

        //---------------------------------------------------------------------------------------------------------

        //Orders
        //PizzaAndPan restaurant
        //Pizza of Americana was ordered by amount of 8
        PizzaAndPan.menu.setNumOfOrders(food, "pizza Americana", 8);
        //Cola was ordered by amount of 10
        PizzaAndPan.menu.setNumOfOrders(drinks, "Coca-cola", 10);
        //Maki was ordered by amount of 2
        LittleJapan.menu.setNumOfOrders(food, "Maki", 2);
        //Tea was ordered by amount of 5
        LittleJapan.menu.setNumOfOrders(drinks, "Tea", 5);

        //---------------------------------------------------------------------------------------------------------
        //Output

        System.out.println("Expenses on salaries for each restaurant per year: ");
        System.out.println(PizzaAndPan.getName() + "- " + PizzaAndPan.getAmountSpentForSalaryPerYear());

        System.out.println("Expenses on salaries for each restaurant per year: ");
        System.out.println(LittleJapan.getName() + "- " + LittleJapan.getAmountSpentForSalaryPerYear());


        System.out.println("Sum of revenues from food in restaurant " + PizzaAndPan.getName() + ": " + PizzaAndPan.menu.getSumOfFood());
        System.out.println("Sum of revenues from drinks in restaurant " + PizzaAndPan.getName() + ": " + PizzaAndPan.menu.getSumOfDrinks());


        System.out.println("Sum of revenues from food in restaurant " + LittleJapan.getName() + ": " + LittleJapan.menu.getSumOfFood());
        System.out.println("Sum of revenues from drinks in restaurant " + LittleJapan.getName() + ": " + LittleJapan.menu.getSumOfDrinks());


        System.out.println("Info about Italian restaurant: " + PizzaAndPan.getInfo());
        System.out.println("Info about Japanese restaurant: " + LittleJapan.getInfo());


    }
}