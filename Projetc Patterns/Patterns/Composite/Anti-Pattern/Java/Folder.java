import java.util.ArrayList;
import java.util.List;

// Não há interface comum.
public class Folder {
    private String name;
    // A lista armazena 'Object', perdendo a segurança de tipo.
    private List<Object> items = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Object item) {
        items.add(item);
    }
    
    public List<Object> getItems() {
        return items;
    }

    // Método com nome específico.
    public void displayFolderName() {
        System.out.println("Pasta: " + name);
    }
}
