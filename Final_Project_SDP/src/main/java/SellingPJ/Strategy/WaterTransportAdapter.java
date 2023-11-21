package SellingPJ.Strategy;

public class WaterTransportAdapter implements TransportStrategy {
    @Override
    public void transportJet(String jetType) {
        System.out.println("Transporting " + jetType + " by water.");
    }
}
