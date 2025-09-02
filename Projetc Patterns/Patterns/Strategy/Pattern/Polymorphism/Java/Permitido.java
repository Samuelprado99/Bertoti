public class Permitido implements Emprestimo{
    @Override
    public void emprestar(Double valor){
        System.out.println("Emprestimo aprovado no valor : " + valor);
    }
}