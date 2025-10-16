public class Customer {
    private String name;
    public Customer(String name) { this.name = name; }

    // Método que a loja terá que chamar diretamente.
    public void beNotified(String productName) {
        System.out.println("Olá " + name + "! O produto '" + productName + "' chegou!");
    }
}