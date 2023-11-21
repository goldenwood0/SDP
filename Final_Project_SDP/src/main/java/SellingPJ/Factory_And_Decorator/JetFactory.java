package SellingPJ.Factory_And_Decorator;

public class JetFactory {
    public Jet createJet(String type, int enginePower, int wingSize, int bodySize) {
        if (type.equalsIgnoreCase("Luxury")) {
            return (Jet) createLuxuryJet(enginePower, wingSize, bodySize);
        } else if (type.equalsIgnoreCase("Business")) {
            return (Jet) createBusinessJet(enginePower, wingSize, bodySize);
        }
        return null;
    }

    private LuxuryJet createLuxuryJet(int enginePower, int wingSize, int bodySize) {
        return new LuxuryJet(enginePower, wingSize, bodySize);
    }

    private BusinessJet createBusinessJet(int enginePower, int wingSize, int bodySize) {
        return new BusinessJet(enginePower, wingSize, bodySize);
    }
}
