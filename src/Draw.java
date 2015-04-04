import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by anastasiakazakova on 04/04/15.
 */
public class Draw extends JPanel {
    private static final Color DA_BGCOLOR = Color.WHITE;
    private static final int MAX_SIZE = 600;

    private int last_square_x = 200;
    private int last_square_y = 200;
    private int last_square_size = 50;

    private boolean clean = false;

    public Draw() {
        super();

        this.setBackground(DA_BGCOLOR);
        this.setBorder(BorderFactory.createLineBorder(Color.black));

        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                System.out.println("mouse pressed" + evt.getPoint().x + " " + evt.getPoint().y);

                if ((evt.getPoint().x > last_square_x) && (evt.getPoint().x < last_square_x + last_square_size) &&
                   (evt.getPoint().y > last_square_y) && (evt.getPoint().y < last_square_y + last_square_size)) {
                    Random rand = new Random();
                    last_square_size = rand.nextInt(MAX_SIZE / 3);
                    last_square_x = rand.nextInt(MAX_SIZE - last_square_size);
                    last_square_y = rand.nextInt(MAX_SIZE - last_square_size);
                } else {
                    clean = true;
                    last_square_size = MAX_SIZE/8;
                    last_square_x = MAX_SIZE/2 - last_square_size/2;
                    last_square_y = MAX_SIZE/2 - last_square_size/2;
                }

                repaint();
            }
        });

        //Set default size
        this.setPreferredSize(new Dimension(MAX_SIZE, MAX_SIZE));
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        if (!clean) {
            int color = last_square_size % 3;

            graphics.setColor(color == 0 ? Color.cyan : color == 1 ? Color.magenta : Color.yellow);
            graphics.fillRect(last_square_x, last_square_y, last_square_size, last_square_size);
        } else {
            graphics.setColor(Color.red);
            graphics.drawString("Missed!", last_square_x + last_square_size/8, last_square_y + last_square_size/2);
            graphics.drawRect(last_square_x, last_square_y, last_square_size, last_square_size);

            clean = false;
        }

//        graphics.drawString("BLAH", 20, 20);
//
//        graphics.setColor(Color.cyan);
//        graphics.drawRect(200, 200, 200, 200);
//
//        graphics.setColor(Color.magenta);
//        graphics.fillRoundRect(50, 50, 100, 100, 80, 80);
//        repaint();
    }
}
