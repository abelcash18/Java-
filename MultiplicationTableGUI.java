import javax.swing.*;
import java.awt.*;

public class MultiplicationTableGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MultiplicationTableGUI::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Multiplication Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 450);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Top input area
        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel label = new JLabel("Number:");
        JTextField numberField = new JTextField(8);

        JLabel rangeLabel = new JLabel("Up to:");
        JTextField upToField = new JTextField(4);
        upToField.setText("20");

        JButton generateButton = new JButton("Generate");

        top.add(label);
        top.add(numberField);
        top.add(rangeLabel);
        top.add(upToField);
        top.add(generateButton);

        // Output area
        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Bottom hint
        JLabel hint = new JLabel("Example: Enter 4 to see 4×1 .. 4×N");
        hint.setForeground(new Color(70, 70, 70));

        generateButton.addActionListener(e -> {
            outputArea.setText("");

            String numberText = numberField.getText().trim();
            String upToText = upToField.getText().trim();

            int number;
            int upTo;

            try {
                number = Integer.parseInt(numberText);
                upTo = Integer.parseInt(upToText);

                if (upTo < 1) {
                    JOptionPane.showMessageDialog(frame, "Up to must be >= 1", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Multiplication table using a for loop
            for (int i = 1; i <= upTo; i++) {
                int product = number * i;
                outputArea.append(number + " x " + i + " = " + product + "\n");
            }
        });

        panel.add(top, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(hint, BorderLayout.SOUTH);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}

