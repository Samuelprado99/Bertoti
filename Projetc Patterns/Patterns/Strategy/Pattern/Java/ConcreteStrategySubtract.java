public class ConcreteStrategySubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Executando estratégia de Subtração");
        return a - b;
    }
}
