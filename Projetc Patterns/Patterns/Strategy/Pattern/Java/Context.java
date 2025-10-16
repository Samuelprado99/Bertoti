public class Context {
    private Strategy strategy;

    // O contexto aceita uma estratégia através do construtor,
    // mas também fornece um setter para que a estratégia possa ser alterada em tempo de execução.
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        // O contexto delega o trabalho para o objeto de estratégia.
        return strategy.execute(a, b);
    }
}