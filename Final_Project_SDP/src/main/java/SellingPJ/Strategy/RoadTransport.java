package SellingPJ.Strategy;

// Concrete Strategy classes
public class RoadTransport implements TransportStrategy {
    @Override
    public void transportJet(String jetType) {
        System.out.println("Transporting " + jetType + " by road.");
    }
}
