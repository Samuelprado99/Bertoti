public class Main {
    public static void main(String[] args) {
        // 1. Model: Cria o modelo de dados.
        DataModel model = new DataModel();

        // 2. View (Composite): Monta a interface.
        Panel mainPanel = new Panel("Painel Principal");
        Label label = new Label("Display");
        
        // 3. Controller (Strategy): Define as ações.
        ActionStrategy increment = new IncrementStrategy();
        ActionStrategy decrement = new DecrementStrategy();

        Button buttonInc = new Button("Incrementar", increment, model);
        Button buttonDec = new Button("Decrementar", decrement, model);

        mainPanel.add(label);
        mainPanel.add(buttonInc);
        mainPanel.add(buttonDec);

        // 4. Model-View (Observer): Conecta o modelo à view.
        model.attach(mainPanel); // O painel propagará a notificação para os filhos.

        // Simulação da Aplicação
        System.out.println("--- Estado Inicial da UI ---");
        mainPanel.draw();
        
        System.out.println("\n--- Simulação de Interação ---");
        buttonInc.click(); // Clica no botão, que usa a Strategy, que muda o Model, que notifica a View.
        buttonInc.click();
        buttonDec.click();
    }
}