package experiment;
import javax.swing.*;
import java.awt.*;

public class exp2 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a rectangle at (100, 100) with width=40 and height=120
        g.drawRect(100, 100, 40, 120);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new exp2());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}