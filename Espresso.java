package assignment_2;

public class Espresso extends Coffee {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}


