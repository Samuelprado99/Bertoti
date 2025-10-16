public class Calculator {
    
    // Um enum ou String para decidir qual operação fazer.
    public enum Operation {
        ADD, SUBTRACT, MULTIPLY
    }

    public int execute(Operation op, int a, int b) {
        if (op == Operation.ADD) {
            System.out.println("Executando lógica de Soma");
            return a + b;
        } else if (op == Operation.SUBTRACT) {
            System.out.println("Executando lógica de Subtração");
            return a - b;
        } else if (op == Operation.MULTIPLY) {
            System.out.println("Executando lógica de Multiplicação");
            return a * b;
        } else {
            throw new IllegalArgumentException("Operação não suportada");
        }
    }
}
