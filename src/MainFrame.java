import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    public MainFrame() {

        this.setComponents();
        this.setMainPanel();
        this.setFrame();
    }

    private void setComponents() {

    }

    private void setMainPanel() {
        this.mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
    }

    private void setFrame() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);

        this.add(mainPanel);
    }
}
