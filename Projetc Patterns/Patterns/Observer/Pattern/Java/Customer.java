public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName) {
        System.out.println("Olá " + name + "! O produto '" + productName + "' chegou na loja!");
    }
}