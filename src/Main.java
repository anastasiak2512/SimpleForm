import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Some magic to draw the form
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BankForm bankForm = new BankForm();
        frame.setContentPane(bankForm.getMainPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
