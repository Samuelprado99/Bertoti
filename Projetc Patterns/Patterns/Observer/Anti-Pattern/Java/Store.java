import java.util.ArrayList;
import java.util.List;

// Anti-padrão: A loja conhece a classe concreta 'Customer'.
public class Store {
    // A lista é do tipo concreto 'Customer', não de uma abstração.
    private List<Customer> customers = new ArrayList<>();
    private String newProduct;

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    // Se amanhã precisarmos notificar um 'Fornecedor', teremos que criar
    // outra lista e outro método de notificação, modificando a classe Store.
    public void notifyCustomers() {
        for (Customer customer : customers) {
            // Chamada direta ao método da classe concreta.
            customer.beNotified(newProduct);
        }
    }

    public void addNewProduct(String product) {
        this.newProduct = product;
        System.out.println("\nLoja: Novo produto adicionado - " + product);
        notifyCustomers();
    }
}
