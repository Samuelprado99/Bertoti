public abstract class UIComponent implements Observer {
    protected String name;

    public UIComponent(String name) { this.name = name; }

    public abstract void draw();

    // O método de clique será implementado por componentes que podem ser clicados.
    public void click() {
        // Por padrão, não faz nada.
    }
}