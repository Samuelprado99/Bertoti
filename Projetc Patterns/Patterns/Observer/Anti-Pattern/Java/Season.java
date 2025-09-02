public class Season {
    public static void main(String[] args) {

        double temperatura = 30.0;
        double umidade = 90.0;
        double pressao = 1500.0;

        Previsao.atualizar(temperatura, umidade, pressao);
        Historico.atualizar(temperatura, umidade, pressao);
    }
}

// Acomplamento - Classe concreta sendo referenciada e toda vez que
// acrescentar uma nova temos que citar a classe concreta nominalmente,
// é uma ligação forte que causa duplicação de código toda vez que alterar
// uma classe, tem que alterar outra