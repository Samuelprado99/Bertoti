import java.util.ArrayList;
import java.util.List;

// O Subject concreto mantém o estado e notifica os observers quando ele muda.
public class Store implements Subject {
    private List<Observer> customers = new ArrayList<>();
    private String newProduct;

    @Override
    public void addObserver(Observer o) {
        customers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        customers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer customer : customers) {
            customer.update(newProduct);
        }
    }

    // Método que muda o estado e aciona a notificação
    public void addNewProduct(String product) {
        this.newProduct = product;
        System.out.println("\nLoja: Novo produto adicionado - " + product);
        notifyObservers();
    }
}