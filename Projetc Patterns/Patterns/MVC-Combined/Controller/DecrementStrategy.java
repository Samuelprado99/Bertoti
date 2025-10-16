public class DecrementStrategy implements ActionStrategy {
    @Override
    public void execute(DataModel model) {
        model.setValue(model.getValue() - 1);
    }
}