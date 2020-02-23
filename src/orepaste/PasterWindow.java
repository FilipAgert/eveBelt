package orepaste;

import javax.swing.*;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import java.awt.*;

public class PasterWindow {
    /**
     * Constructor for pasterwindow
     * @param title - Title of PasterWindow
     * @param width - Width of PasterWindow
     * @param height - Height of PasterWindow
     */
    public PasterWindow(String title, int width, int height) {
        SwingUtilities.invokeLater(() -> createWindow(title, width, height));
    }

    private void createWindow(String title, int width, int height) {
        Highlighter hilit = new DefaultHighlighter();
        JFrame frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = frame.getContentPane();

        JTextArea textArea = new JTextArea();
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        pane.add(textArea);

        JPanel jpanel = new JPanel();
        pane.add(jpanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }


}
