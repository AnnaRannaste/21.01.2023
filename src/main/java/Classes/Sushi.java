package Classes;

import Enums.TypeOfKitchen;
import Interfaces.IMenuSum;

public class Sushi extends Restaurant implements IMenuSum {

    public Menu menu;
    public Sushi(String name, double turnover, int numOfWorkers, TypeOfKitchen kitchen, String location, double rating, boolean hasPlayPlace, Menu menu) {
        super(name, turnover, numOfWorkers, kitchen, location, rating, hasPlayPlace);
        this.menu = menu;
    }


    @Override
    public double getProductSum()
    {
        return menu.getSumOfDrinks()+ menu.getSumOfFood();
    }
}


