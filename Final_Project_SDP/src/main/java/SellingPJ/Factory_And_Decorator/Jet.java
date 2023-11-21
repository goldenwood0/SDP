package SellingPJ.Factory_And_Decorator;

import SellingPJ.Strategy.TransportStrategy;

public interface Jet {
    void start();
    void setTransportStrategy(TransportStrategy strategy);
    void getTransportStrategy(TransportStrategy strategy);
    int getEnginePower();
    int getBodySize();
    int getWingSize();

}
