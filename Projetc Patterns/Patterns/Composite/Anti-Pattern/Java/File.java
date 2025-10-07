// Não há interface comum.
public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }
    
    // Método com nome específico.
    public void showFileName() {
        System.out.println("  - Arquivo: " + name);
    }
}
