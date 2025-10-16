public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Executando estratégia de Multiplicação");
        return a * b;
    }
}