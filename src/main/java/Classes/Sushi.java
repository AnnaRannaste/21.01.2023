package Classes;

import Enums.TypeOfKitchen;
import Interfaces.IMenuSum;

public class Sushi extends Restaurant implements IMenuSum {
    private final double taxRate = 0.3;
    public Menu menu;

    public Sushi(String name, double turnover, int numOfWorkers, TypeOfKitchen kitchen, String location, double rating,
                 boolean hasPlayPlace, Menu menu) {
        super(name, turnover, numOfWorkers, kitchen, location, rating, hasPlayPlace);
        this.menu = menu;
    }


    @Override
    public double getProductSum() {

        return menu.getSumOfDrinks() + menu.getSumOfFood();
    }

    public double getAmountSpentForSalaryPerYear() {
        return taxRate * numOfWorkers * turnoverPerYear;
    }

    public String getInfo() {
        return "Sushi restaurant named " + name + " has " + numOfWorkers + " workers, " + TypeOfKitchen.japanese +
                " type of kitchen, " + " located in " + location + ", with rating " + rating;
    }

}


