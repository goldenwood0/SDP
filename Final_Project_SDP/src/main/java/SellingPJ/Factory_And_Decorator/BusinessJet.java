package SellingPJ.Factory_And_Decorator;

import SellingPJ.Strategy.TransportStrategy;
import com.sun.jdi.connect.Transport;

import java.util.ArrayList;
import java.util.List;

public class BusinessJet implements JetWithComponents {
    private final List<JetComponent> components = new ArrayList<>();
    private int enginePower;
    private int wingSize;
    private int bodySize;

    public BusinessJet(int enginePower, int wingSize, int bodySize) {
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
        strategy.transportJet("Business Jet");
    }

    public BusinessJet() {
    }

    @Override
    public void start() {
        System.out.println("Starting Business Jet...");
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
    @Override
    public String getSeatColor() {
        return "Business Jet Seat Color";
    }

    @Override
    public String getWingColor() {
        return "Business Jet Wing Color";
    }
}
