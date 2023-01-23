package Classes;

public abstract class Business {

    protected String name;
    protected double turnover;
    protected int numOfWorkers;

    public Business(String name, double turnover, int numOfWorkers) {
        this.name = name;
        this.turnover = turnover;
        this.numOfWorkers = numOfWorkers;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double input) {
        turnover = input;
    }



}
