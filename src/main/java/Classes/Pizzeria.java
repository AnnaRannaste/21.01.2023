package Classes;

import Enums.TypeOfKitchen;
import Interfaces.IMenuSum;

import java.awt.*;

public class Pizzeria extends Restaurant implements IMenuSum {
    public Menu menu;

    public Pizzeria(String name, double turnover, int numOfWorkers, TypeOfKitchen kitchen, String location, double rating, boolean hasPlayPlace, Menu menu) {
        super(name, turnover, numOfWorkers, kitchen, location, rating, hasPlayPlace);
        this.menu = menu;
    }

    @Override
    public double getProductSum() {
        return menu.getSumOfDrinks() + menu.getSumOfFood();
    }
}
