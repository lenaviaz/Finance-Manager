//package org.kodejava.swing;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class PopulateTextAreaFromFile extends JPanel {
    public PopulateTextAreaFromFile() {
        initialize();
    }

    public static void showFrame() {
        JPanel panel = new PopulateTextAreaFromFile();
        panel.setOpaque(true);

        JFrame frame = new JFrame("Populate JTextArea from File");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PopulateTextAreaFromFile::showFrame);
    }

    private void initialize() {
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        try {
            // Read some text from the resource file to display in
            // the JTextArea.
            textArea.read(new InputStreamReader(Objects.requireNonNull(
                    getClass().getResourceAsStream("/data.txt"))), null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setPreferredSize(new Dimension(500, 200));
        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.CENTER);
    }
}