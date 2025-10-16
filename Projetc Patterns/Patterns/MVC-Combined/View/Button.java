public class Button extends UIComponent {
    private ActionStrategy action;
    private DataModel model;

    public Button(String name, ActionStrategy action, DataModel model) {
        super(name);
        this.action = action;
        this.model = model;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando Botão: [" + name + "]");
    }

    @Override
    public void click() {
        System.out.println("=> Botão '" + name + "' clicado!");
        action.execute(model); // Delega a ação para a Strategy.
    }
    
    @Override
    public void update(int value) {
        // Botões não precisam se atualizar com o valor, então o método fica vazio.
    }
}