public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Para cada operação, o cliente deve passar um "tipo".
        int resultA = calculator.execute(Calculator.Operation.ADD, 10, 5);
        System.out.println("Resultado A: " + resultA);

        int resultB = calculator.execute(Calculator.Operation.SUBTRACT, 10, 5);
        System.out.println("Resultado B: " + resultB);
        
        // Se quisermos adicionar "Divisão", teremos que modificar a classe Calculator,
        // violando o Princípio Aberto/Fechado.
    }
}