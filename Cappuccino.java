package assignment_2;

public class Cappuccino extends Coffee {
    public Cappuccino() {
        description = "Cappuccino";
    }

    @Override
    public double cost() {
        return 3.5;
    }
}