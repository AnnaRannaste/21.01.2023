package Classes;

import Enums.TypeOfItems;
import Interfaces.IDrinks;
import Interfaces.IFood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu implements IFood, IDrinks {
    private Map<String, Extension> food;
    private Map<String, Extension> drink;

    public Menu() {
        food = new HashMap<>();
        drink = new HashMap<>();
    }

    public void addItem(TypeOfItems item, String input, Double price, List<Ingredient> ingredients) {
        if (item == TypeOfItems.food) {
            food.put(input, new Extension(1, price, ingredients));
        }
        if (item == TypeOfItems.drinks) {
            drink.put(input, new Extension(1, price, null));
        }
    }

    @Override
    public double getSumOfDrinks() {
        double sum = 0;
        for (Map.Entry<String, Extension> entry :
                drink.entrySet()) {
            sum += entry.getValue().getAmount() * entry.getValue().getPrice();
        }
        return sum;
    }

    @Override
    public double getSumOfFood() {
        double sum = 0;
        for (Map.Entry<String, Extension> entry :
                food.entrySet()) {
            sum += entry.getValue().getAmount() * entry.getValue().getPrice();
        }
        return sum;
    }

    public void setNumOfOrders(TypeOfItems item, String input, int num) {
        if (item == TypeOfItems.food) {
            for (Map.Entry<String, Extension> entry :
                    food.entrySet()) {
                if (input.equals(entry.getKey())) {
                    entry.getValue().setAmount(num);
                }
            }
        }
        if (item == TypeOfItems.drinks) {
            for (Map.Entry<String, Extension> entry :
                    drink.entrySet()) {
                if (input.equals(entry.getKey())) {
                    entry.getValue().setAmount(num);
                }
            }
        }
    }
}