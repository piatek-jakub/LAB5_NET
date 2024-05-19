import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KnapsackGUI {

    private JTextField numberOfItemsTextField;
    private JTextField seedTextField;
    private JTextField capacityTextField;
    private JButton calculateButton;
    private JTextArea problemTextArea;
    private JTextArea resultTextArea;
    private JPanel MyJPanel;

    public KnapsackGUI() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveKnapsack();
            }
        });
    }

    private void solveKnapsack() {
        try {
            int seed = Integer.parseInt(seedTextField.getText());
            int numberOfItems = Integer.parseInt(numberOfItemsTextField.getText());
            int capacity = Integer.parseInt(capacityTextField.getText());
            Problem problem = new Problem(numberOfItems, seed);
            problemTextArea.setText(problem.toString());
            Result result = problem.Solve(capacity);
            resultTextArea.setText(result.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(MyJPanel, "Enter valid parameters!");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("KnapsackGUI");
        frame.setContentPane(new KnapsackGUI().MyJPanel);
        frame.setPreferredSize(new Dimension(700, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        MyJPanel = new JPanel();
        MyJPanel.setLayout(new GridBagLayout());
        final JLabel label1 = new JLabel();
        label1.setText("Number of items:");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        MyJPanel.add(label1, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        MyJPanel.add(spacer1, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.VERTICAL;
        MyJPanel.add(spacer2, gbc);
        numberOfItemsTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        MyJPanel.add(numberOfItemsTextField, gbc);
        final JLabel label2 = new JLabel();
        label2.setText("Seed:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        MyJPanel.add(label2, gbc);
        seedTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        MyJPanel.add(seedTextField, gbc);
        final JLabel label3 = new JLabel();
        label3.setText("Capacity");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        MyJPanel.add(label3, gbc);
        capacityTextField = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        MyJPanel.add(capacityTextField, gbc);
        calculateButton = new JButton();
        calculateButton.setText("Calculate");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        MyJPanel.add(calculateButton, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 200, 0, 0);
        MyJPanel.add(spacer3, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 200, 0, 0);
        MyJPanel.add(spacer4, gbc);
        final JScrollPane scrollPane1 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 8;
        gbc.fill = GridBagConstraints.BOTH;
        MyJPanel.add(scrollPane1, gbc);
        problemTextArea = new JTextArea();
        scrollPane1.setViewportView(problemTextArea);
        final JScrollPane scrollPane2 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.gridheight = 8;
        gbc.fill = GridBagConstraints.BOTH;
        MyJPanel.add(scrollPane2, gbc);
        resultTextArea = new JTextArea();
        scrollPane2.setViewportView(resultTextArea);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        MyJPanel.add(spacer5, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(0, 0, 100, 0);
        MyJPanel.add(spacer6, gbc);
        label1.setLabelFor(scrollPane1);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return MyJPanel;
    }

}
