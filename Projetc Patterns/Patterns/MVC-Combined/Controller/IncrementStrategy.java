public class IncrementStrategy implements ActionStrategy {
    @Override
    public void execute(DataModel model) {
        model.setValue(model.getValue() + 1);
    }
}