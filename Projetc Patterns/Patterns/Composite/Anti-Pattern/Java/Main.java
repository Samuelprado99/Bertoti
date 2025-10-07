public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("Meus Documentos");
        Folder trabalho = new Folder("Trabalho");
        
        trabalho.add(new File("Relatorio.docx"));
        trabalho.add(new File("Planilha.xlsx"));
        
        root.add(trabalho);
        root.add(new File("Foto_ferias.jpg"));

        // O cliente é forçado a percorrer a estrutura manualmente.
        printStructure(root);
    }

    // Este método é o problema: ele precisa saber sobre cada tipo concreto.
    public static void printStructure(Folder folder) {
        folder.displayFolderName(); // Chama o método específico da pasta.

        for (Object item : folder.getItems()) {
            // Verificação de tipo (instanceof) quebra o polimorfismo.
            if (item instanceof Folder) {
                printStructure((Folder) item); // Chamada recursiva.
            } else if (item instanceof File) {
                ((File) item).showFileName(); // Chama o método específico do arquivo.
            }
        }
    }
}