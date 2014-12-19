import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by anastasiakazakova on 20/12/14.
 */
public class BankForm {
    private JPanel mainPanel;
    private JTextField myText;
    private JButton myButton;

    public BankForm() {

        //Handle button pressing
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                myText.setText(myText.getText() + " horay!");
            }
        });
    }

    //Add a getter for mainPanel
    public JPanel getMainPanel() {
        return mainPanel;
    }
}
