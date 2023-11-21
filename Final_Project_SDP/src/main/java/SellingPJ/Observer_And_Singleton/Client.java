package SellingPJ.Observer_And_Singleton;
public class Client implements Observer {
    @Override
    public void update(String message) {
        System.out.println("New message for client: " + message);
    }
}

