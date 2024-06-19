import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistration extends JFrame {

    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField addressField;
    private JTextField dobField;
    private JButton submitButton;

    public UserRegistration() {
        createView();

        setTitle("User Registration");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(firstNameLabel);

        firstNameField = new JTextField(20);
        firstNameField.setMaximumSize(firstNameField.getPreferredSize());
        panel.add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(lastNameLabel);

        lastNameField = new JTextField(20);
        lastNameField.setMaximumSize(lastNameField.getPreferredSize());
        panel.add(lastNameField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(addressLabel);

        addressField = new JTextField(20);
        addressField.setMaximumSize(addressField.getPreferredSize());
        panel.add(addressField);

        JLabel dobLabel = new JLabel("Date of Birth (YYYY-MM-DD):");
        dobLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(dobLabel);

        dobField = new JTextField(10);
        dobField.setMaximumSize(dobField.getPreferredSize());
        panel.add(dobField);

        submitButton = new JButton("Submit");
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        submitButton.addActionListener(new SubmitButtonActionListener());
        panel.add(submitButton);
    }

    private class SubmitButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String address = addressField.getText();
            String dob = dobField.getText();

            // For simplicity, just displaying the data in a dialog
            JOptionPane.showMessageDialog(
                    UserRegistration.this,
                    "First Name: " + firstName + "\n"
                            + "Last Name: " + lastName + "\n"
                            + "Address: " + address + "\n"
                            + "Date of Birth: " + dob,
                    "User Registration Data",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }
}
