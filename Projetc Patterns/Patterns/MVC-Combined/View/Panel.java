import java.util.ArrayList;
import java.util.List;

// Composite: Um painel que agrupa outros componentes.
public class Panel extends UIComponent {
    private List<UIComponent> children = new ArrayList<>();

    public Panel(String name) { super(name); }

    public void add(UIComponent component) {
        children.add(component);
    }

    @Override
    public void draw() {
        System.out.println("+--- Painel: " + name + " ---+");
        for (UIComponent child : children) {
            child.draw();
        }
        System.out.println("+------------------------+");
    }

    @Override
    public void update(int value) {
        // Notifica todos os filhos sobre a mudança.
        for (UIComponent child : children) {
            child.update(value);
        }
    }
}
