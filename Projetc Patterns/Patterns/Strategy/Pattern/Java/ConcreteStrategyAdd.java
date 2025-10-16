public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Executando estratégia de Soma");
        return a + b;
    }
}