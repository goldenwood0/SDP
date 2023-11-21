package SellingPJ.Factory_And_Decorator;

public class SeatColorDecorator extends JetComponentDecorator {
    private final String color;

    public SeatColorDecorator(JetComponent decoratedComponent, String color) {
        super(decoratedComponent);
        this.color = color;
    }

    @Override
    public void assemble() {
        super.assemble();
        applyColor();
    }

    private void applyColor() {
        System.out.println("Applying " + color + " color to wings");
    }

    public String getColor() {
        return this.color;
    }
}