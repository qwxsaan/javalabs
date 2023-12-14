package T3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.sqrt;
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.addSquareListener(new SquareListener());
    }

    class SquareListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double value = view.getValue();
            model.setValue(value);
            double result = sqrt(model.getValue());
            view.setResult(result);
        }
    }
}
