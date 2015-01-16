import javax.swing.*;

//https://github.com/anastasiak2512/SimpleForm.git
public class Main {

    public static void main(String[] args) {
        //Some magic to draw the form
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BaseCalc calc = new BaseCalc();
        frame.setContentPane(calc.getCalcPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
