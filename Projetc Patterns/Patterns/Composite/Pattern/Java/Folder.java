import java.util.ArrayList;
import java.util.List;

// Também implementa a interface comum.
public class Folder implements FileSystemItem {
    private String name;
    // A lista contém objetos do tipo da interface, permitindo qualquer implementação.
    private List<FileSystemItem> items = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void printName() {
        System.out.println("Pasta: " + name);
        // O cliente não precisa saber o que está aqui dentro. Apenas chama o método.
        for (FileSystemItem item : items) {
            item.printName(); // Polimorfismo em ação!
        }
    }
}
