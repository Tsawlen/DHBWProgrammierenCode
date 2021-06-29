package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExampleVorlesung extends JFrame {

    private GridLayoutExampleVorlesung()
    {
        this.setTitle("GridLayout Example");

        this.setLayout(new GridLayout(0,2));

        this.add(new JLabel("Feld 1:"));
        JPanel cellPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cellPanel.add(new JTextField(10));
        this.add(cellPanel);
        this.add(new JLabel("Feld 2: "));
        JPanel cellPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cellPanel2.add(new JTextField(10));
        this.add(cellPanel2);
        this.add(new JLabel("Feld 3: "));
        JPanel cellPanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cellPanel3.add(new JTextField(10));
        this.add(cellPanel3);
        this.add(new JLabel("Feld 4:"));
        JPanel cellPanel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cellPanel4.add(new JTextField(10));
        this.add(cellPanel4);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExampleVorlesung();
    }

}
