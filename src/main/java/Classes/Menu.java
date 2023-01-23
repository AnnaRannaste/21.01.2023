package Classes;

import Enums.TypeOfItems;
import Interfaces.IDrinks;
import Interfaces.IFood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu implements IFood, IDrinks {
    private Map<String, Double> food;
    private Map<String, Double> drink;

    public Menu(){
        food = new HashMap<>();
        drink = new HashMap<>();
    }

    public void addItem(TypeOfItems item, String input, Double price){
        if(item == TypeOfItems.food){
            food.put(input, price);
        }
        if(item == TypeOfItems.drinks){
            drink.put(input, price);
        }
    }

    @Override
    public double getSumOfDrinks() {
        double sum = 0;
        for (Map.Entry<String, Double> entry:
             drink.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }

    @Override
    public double getSumOfFood() {
        double sum = 0;
        for (Map.Entry<String, Double> entry:
                food.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }
}
