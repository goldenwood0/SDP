package SellingPJ.Factory_And_Decorator;

public class Seat implements JetComponent {
    @Override
    public void assemble() {
        System.out.println("Assembling Seats");
    }
}
