package SellingPJ.Adapter;

import SellingPJ.Factory_And_Decorator.JetComponent;
import SellingPJ.Factory_And_Decorator.JetWithComponents;
import SellingPJ.Strategy.TransportStrategy;

public class EnginePowerAdapter implements JetWithComponents {
    private JetWithComponents jet;

    public EnginePowerAdapter(JetWithComponents jet) {
        this.jet = jet;
    }

    @Override
    public void addComponent(JetComponent component) {
        jet.addComponent(component);
    }

    @Override
    public String getSeatColor() {
        return jet.getSeatColor();
    }

    @Override
    public String getWingColor() {
        return jet.getWingColor();
    }

    @Override
    public void setEnginePower(int newEnginePower) {

    }

    @Override
    public void start() {
        System.out.println("Increasing engine power...");
        int newEnginePower = jet.getEnginePower() + 100; // Increase engine power by 100 (or any desired amount)
        jet.setEnginePower(newEnginePower);
        jet.start();
    }

    @Override
    public void setTransportStrategy(TransportStrategy strategy) {

    }

    @Override
    public void getTransportStrategy(TransportStrategy strategy) {

    }

    @Override
    public int getEnginePower() {
        return 0;
    }

    @Override
    public int getBodySize() {
        return 0;
    }

    @Override
    public int getWingSize() {
        return 0;
    }
}