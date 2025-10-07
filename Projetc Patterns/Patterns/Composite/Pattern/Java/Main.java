public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("Meus Documentos");
        Folder trabalho = new Folder("Trabalho");
        
        trabalho.add(new File("Relatorio.docx"));
        trabalho.add(new File("Planilha.xlsx"));
        
        root.add(trabalho);
        root.add(new File("Foto_ferias.jpg"));

        // O cliente trata a árvore inteira de forma uniforme.
        // Não há ifs ou instanceof.
        root.printName();
    }
}