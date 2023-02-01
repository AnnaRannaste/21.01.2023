package Classes;

import Enums.TypeOfKitchen;

import java.util.List;

public class Restaurant extends Business {
    protected TypeOfKitchen kitchen;
    protected String location;
    protected double rating;
    protected boolean hasPlayPlace;

    public Restaurant(String name, double turnover, int numOfWorkers, TypeOfKitchen kitchen, String location, double
            rating, boolean hasPlayPlace) {
        super(name, turnover, numOfWorkers);
        this.kitchen = kitchen;
        this.location = location;
        this.rating = rating;
        this.hasPlayPlace = hasPlayPlace;
    }
}



