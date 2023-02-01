package Classes;

public abstract class Business {

    protected String name;
    protected double turnoverPerYear;
    protected int numOfWorkers;

    public Business(String name, double turnoverPerYear, int numOfWorkers) {
        this.name = name;
        this.turnoverPerYear = turnoverPerYear;
        this.numOfWorkers = numOfWorkers;
    }

    public double getTurnoverPerYear() {

        return turnoverPerYear;
    }

    public void setTurnoverPerYear(double input) {

        turnoverPerYear = input;
    }

    public String getName() {
        return name;
    }
}
