package SellingPJ.Factory_And_Decorator;

import SellingPJ.Strategy.TransportStrategy;

import java.util.ArrayList;
import java.util.List;

public class LuxuryJet implements JetWithComponents {
    private final List<JetComponent> components = new ArrayList<>();
    private int enginePower;
    private int wingSize;
    private int bodySize;
    private int bedrooms;

    public LuxuryJet(int enginePower, int wingSize, int bodySize) {
        this.enginePower = enginePower;
        this.wingSize = wingSize;
        this.bodySize = bodySize;
    }
    private TransportStrategy transportStrategy;

    @Override
    public void setTransportStrategy(TransportStrategy strategy) {
        this.transportStrategy = strategy;
    }
    public void getTransportStrategy(TransportStrategy strategy){
        strategy.transportJet("Luxury Jet");
    }
    public LuxuryJet() {}

    @Override
    public void start() {
        System.out.println("Starting Luxury Jet...");
        assemble();
    }

    @Override
    public void addComponent(JetComponent component) {
        components.add(component);
    }

    private void assemble() {
        for (JetComponent component : components) {
            component.assemble();
        }
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getWingSize() {
        return wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    public int getBodySize() {
        return bodySize;
    }

    public void setBodySize(int bodySize) {
        this.bodySize = bodySize;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }
    @Override
    public String getSeatColor() {
        return "Luxury Jet Seat Color";
    }

    @Override
    public String getWingColor() {
        return "Luxury Jet Wing Color";
    }
}
