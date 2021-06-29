package lecture.chapter10;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CombinedExample extends JFrame {

    public String[] types = {"FTP", "SSH", "TELNET"};
    private CombinedExample()
    {
        this.setTitle("Logon");

        this.setLayout(new BorderLayout());

        JPanel upperPanel = new JPanel();
        JPanel lowerPanel = new JPanel();

        upperPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        lowerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        lowerPanel.add(new JButton("OK"));
        lowerPanel.add(new JButton("Cancel"));

        //Panels for Center area

        JPanel connectionPanel = new JPanel();
        JPanel dataPanel = new JPanel();

        connectionPanel.setLayout(new GridLayout(6,2));
        dataPanel.setLayout(new GridLayout(3,2));

        //Connection Panel

        JPanel connectionText = new JPanel();
        connectionText.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel userLabel = new JPanel();
        userLabel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel passwordLabel = new JPanel();
        passwordLabel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel typeLabel = new JPanel();
        typeLabel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel hostLabel = new JPanel();
        hostLabel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel portLabel = new JPanel();
        portLabel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JPanel userInput = new JPanel();
        userInput.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel passwordInput = new JPanel();
        passwordInput.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel typeInput = new JPanel();
        typeInput.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel hostInput = new JPanel();
        hostInput.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel portInput = new JPanel();
        portInput.setLayout(new FlowLayout(FlowLayout.LEFT));

        userLabel.add(new JLabel("User: "));
        passwordLabel.add(new JLabel("Passwort:"));
        typeLabel.add(new JLabel("Art:"));
        hostLabel.add(new JLabel("Host:"));
        portLabel.add(new JLabel("Port:"));

        userInput.add(new JTextField(15));
        passwordInput.add(new JTextField(15));
        typeInput.add(new JComboBox<>(types));
        hostInput.add(new JTextField(15));
        portInput.add(new JTextField(2));

        connectionText.add(new JLabel("Verbindung"));

        connectionPanel.add(connectionText);
        connectionPanel.add(new JLabel(""));
        connectionPanel.add(userLabel);
        connectionPanel.add(userInput);
        connectionPanel.add(passwordLabel);
        connectionPanel.add(passwordInput);
        connectionPanel.add(typeLabel);
        connectionPanel.add(typeInput);
        connectionPanel.add(hostLabel);
        connectionPanel.add(hostInput);
        connectionPanel.add(portLabel);
        connectionPanel.add(portInput);

        connectionPanel.setBorder(new EmptyBorder(10,10,0,20));
        upperPanel.add(connectionPanel);

        //Data Panel

        JPanel dataLabel = new JPanel();
        dataLabel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel sourceLabel = new JPanel();
        sourceLabel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel sourceInput = new JPanel();
        sourceInput.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel destinationLabel = new JPanel();
        destinationLabel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel destinationInput = new JPanel();
        destinationInput.setLayout(new FlowLayout(FlowLayout.LEFT));

        dataLabel.add(new JLabel("Dateien"));
        sourceLabel.add(new JLabel("Quelle:"));
        sourceInput.add(new JTextField(15));
        destinationLabel.add(new JLabel("Ziel:"));
        destinationInput.add(new JTextField(15));

        dataPanel.add(dataLabel);
        dataPanel.add(new JLabel());
        dataPanel.add(sourceLabel);
        dataPanel.add(sourceInput);
        dataPanel.add(destinationLabel);
        dataPanel.add(destinationInput);

        dataPanel.setBorder(new EmptyBorder(10,20,10,20));
        upperPanel.add(dataPanel);


        this.add(upperPanel, BorderLayout.CENTER);
        this.add(lowerPanel, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(3);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new CombinedExample();
    }
}
