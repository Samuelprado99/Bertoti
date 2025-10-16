public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        
        // Os objetos são do tipo concreto.
        Customer customer1 = new Customer("João");
        Customer customer2 = new Customer("Maria");

        store.addCustomer(customer1);
        store.addCustomer(customer2);

        store.addNewProduct("iPhone 20");
    }
}
