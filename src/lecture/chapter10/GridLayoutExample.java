package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    private GridLayoutExample()
    {
        this.setTitle("GridLayout Example");
        this.setLayout(new GridLayout(3,4));

        this.add(new JLabel("Test"));
        this.add(new JLabel("Test 2"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new GridLayoutExample();

    }

}
