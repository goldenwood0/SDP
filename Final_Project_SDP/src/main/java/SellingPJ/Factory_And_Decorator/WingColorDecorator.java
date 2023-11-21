package SellingPJ.Factory_And_Decorator;

public class WingColorDecorator extends JetComponentDecorator {
    private final String color;

    public WingColorDecorator(JetComponent decoratedComponent, String color) {
        super(decoratedComponent);
        this.color = color;
    }

    @Override
    public void assemble() {
        super.assemble();
        applySize();
    }

    private void applySize() {
        System.out.println("Setting wing color to " + color );
    }

    public String getColor() {
        return this.color;
    }
}