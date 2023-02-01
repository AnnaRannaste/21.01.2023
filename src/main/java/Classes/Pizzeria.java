package Classes;

import Enums.TypeOfKitchen;
import Interfaces.IMenuSum;

public class Pizzeria extends Restaurant implements IMenuSum {
    public Menu menu;
    private final double taxRate = 0.2;

    public Pizzeria(String name, double turnover, int numOfWorkers, TypeOfKitchen kitchen, String location, double rating, boolean hasPlayPlace, Menu menu) {
        super(name, turnover, numOfWorkers, kitchen, location, rating, hasPlayPlace);
        this.menu = menu;
    }

    @Override
    public double getProductSum() {

        return menu.getSumOfDrinks() + menu.getSumOfFood();
    }

    public double getOverallSum(){
        return 0;
    }

    public double getAmountSpentForSalaryPerYear(){
        return taxRate * numOfWorkers * turnoverPerYear;
    }

    public String getInfo(){
    return "Pizzeria named " + name + " has " + numOfWorkers  + " workers, " + TypeOfKitchen.italian +
            " type of kitchen, "  + " located in " + location + ", with rating " + rating;

    }
}
