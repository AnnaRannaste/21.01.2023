package Classes;

import java.util.List;

public class Extension {
    private int amount;
    private double price;
    private List<Ingredient> ingredients;


    public Extension(int amount, double price, List<Ingredient> ingredients) {
        this.amount = amount;
        this.price = price;
        this.ingredients = ingredients;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
