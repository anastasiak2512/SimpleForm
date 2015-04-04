import javax.swing.*;

//https://github.com/anastasiak2512/SimpleForm.git
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Draw drawing = new Draw();
        frame.setContentPane(drawing);

        frame.pack();
        frame.setVisible(true);
    }
}
