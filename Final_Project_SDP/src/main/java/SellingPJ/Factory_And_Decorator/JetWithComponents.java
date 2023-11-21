package SellingPJ.Factory_And_Decorator;

public interface JetWithComponents extends Jet {
    void addComponent(JetComponent component);

    String getSeatColor();
    String getWingColor();

    void setEnginePower(int newEnginePower);
}
