public class Label extends UIComponent {
    private String text;

    public Label(String name) {
        super(name);
        this.text = "";
    }

    @Override
    public void draw() {
        System.out.println("Desenhando Label '" + name + "': " + text);
    }

    @Override
    public void update(int value) {
        this.text = "Valor: " + value;
        draw(); // Redesenha ao ser notificado.
    }
}