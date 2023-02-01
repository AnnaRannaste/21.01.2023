package Classes;

public class Ingredient {

    private String ingredient;
    private double price;



    public Ingredient(String ingredient, double price) {
    this.ingredient = ingredient;
    this.price = price;

        }

    public String getIngredient() {

        return ingredient;
    }

    public void setIngredient(String ingredient)
    {

        this.ingredient = ingredient;
    }

    public double getPrice()
    {

        return price;
    }

    public void setPrice(double price)
    {

        this.price = price;
    }
}