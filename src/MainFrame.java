import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    public MainFrame() {

        this.setComponents();
        this.setMainPanel();
        this.setFrame();
    }

    private void setComponents() {

    }

    // @Override
    public void paint(Graphics g) {
        // szin beallitasa
        g.setColor(Color.BLUE);
        g.fillRect(10, 20, 100, 100);

        g.setColor(new Color(150, 230, 30)); //green
        g.fillRect(210, 220, 100, 100);

        g.setColor(new Color(183, 107, 25));
        g.fillOval(110, 150, 40, 40);

        g.setColor(Color.BLACK);
        g.drawLine(0, 0, 300, 300);
        g.drawLine(310, 0, 0, 300);

        //szöveg

        g.setColor(Color.ORANGE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("szöveg rajzolva", 30, 130);
    }

    private void setMainPanel() {
        this.mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

    }

    private void setFrame() {

        this.add(mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);

    }
}
