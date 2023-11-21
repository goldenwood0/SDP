package SellingPJ.Factory_And_Decorator;

public class Wing implements JetComponent {
    @Override
    public void assemble() {
        System.out.println("Assembling Wings");
    }
}
