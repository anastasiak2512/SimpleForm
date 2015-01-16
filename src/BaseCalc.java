import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anastasiakazakova on 17/01/15.
 */
public class BaseCalc {
    private JPanel CalcPanel;
    private JButton plusButton;
    private JButton resultButton;
    private JTextArea textArea;

    private float result = 0;

    public BaseCalc() {
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                addFloatToResult();
                textArea.setText("");
            }
        });

        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                addFloatToResult();
                textArea.setText(Float.toString(result));
                result = 0;
            }
        });
    }

    private void addFloatToResult() {
        float arg;
        try {
            arg = Float.parseFloat(textArea.getText());
        } catch (NumberFormatException e) {
            arg = 0;
        }
        result += arg;
    }

    public JPanel getCalcPanel() {
        return CalcPanel;
    }
}
