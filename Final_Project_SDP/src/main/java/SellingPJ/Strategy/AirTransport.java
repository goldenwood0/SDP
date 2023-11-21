package SellingPJ.Strategy;

public class AirTransport implements TransportStrategy {
    @Override
    public void transportJet(String jetType) {
        System.out.println("Transporting " + jetType + " by air.");
    }
}
