package SellingPJ.Factory_And_Decorator;

public abstract class JetComponentDecorator implements JetComponent {
    protected JetComponent decoratedComponent;

    public JetComponentDecorator(JetComponent decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    @Override
    public void assemble() {
        decoratedComponent.assemble();
    }
}