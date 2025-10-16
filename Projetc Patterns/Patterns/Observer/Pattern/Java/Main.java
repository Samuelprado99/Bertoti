public class Main {
    public static void main(String[] args) {
        // 1. Criar o Sujeito
        Store store = new Store();

        // 2. Criar os Observadores
        Observer customer1 = new Customer("João");
        Observer customer2 = new Customer("Maria");

        // 3. Registrar os observadores no sujeito
        store.addObserver(customer1);
        store.addObserver(customer2);

        // 4. Mudar o estado do sujeito. Isso notificará todos os observadores registrados.
        store.addNewProduct("iPhone 20");
        
        // Maria não quer mais receber notificações
        store.removeObserver(customer2);
        
        store.addNewProduct("Samsung Galaxy S30");
    }
}
