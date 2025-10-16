public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // Cliente decide usar a estratégia de soma
        context.setStrategy(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(10, 5);
        System.out.println("Resultado A: " + resultA); // 15

        // Cliente decide mudar para a estratégia de subtração
        context.setStrategy(new ConcreteStrategySubtract());
        int resultB = context.executeStrategy(10, 5);
        System.out.println("Resultado B: " + resultB); // 5

        // Cliente decide mudar para a estratégia de multiplicação
        context.setStrategy(new ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(10, 5);
        System.out.println("Resultado C: " + resultC); // 50
    }
}
