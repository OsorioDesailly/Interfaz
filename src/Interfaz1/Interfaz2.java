package Interfaz1;

import javax.swing.*;
import java.awt.*;

public class Interfaz2 extends JFrame {

    public Interfaz2() {
        setTitle("Person Registration and Search (Java Swing)");
        setSize(720, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titleLabel = new JLabel("PERSON REGISTRATION FORM", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 15));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(15, 0, 5, 0));
        add(titleLabel, BorderLayout.NORTH);

        JPanel leftPanel = new JPanel(new GridLayout(5, 2, 5, 12));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));

        leftPanel.add(new JLabel("ID (Number)"));
        JTextField txtId = new JTextField("12345");
        leftPanel.add(txtId);

        leftPanel.add(new JLabel("Name"));
        JTextField txtName = new JTextField("Juanito");
        leftPanel.add(txtName);

        leftPanel.add(new JLabel("Age"));
        JTextField txtAge = new JTextField("79");
        leftPanel.add(txtAge);

        leftPanel.add(new JLabel("Gender"));
        String[] genders = {"Masculino", "Femenino", "Otro"};
        JComboBox<String> cmbGender = new JComboBox<>(genders);
        cmbGender.setSelectedItem("Masculino");
        leftPanel.add(cmbGender);

        leftPanel.add(new JLabel("Address"));
        JTextField txtAddress = new JTextField("Calle 10, No. 123");
        leftPanel.add(txtAddress);

        add(leftPanel, BorderLayout.CENTER);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));

        JPanel operationsPanel = new JPanel(new GridLayout(8, 1, 2, 2));
        operationsPanel.setBorder(BorderFactory.createTitledBorder("Person Operations"));
        
        operationsPanel.add(new JButton("Register Person"));
        operationsPanel.add(new JButton("Update Person"));
        operationsPanel.add(new JButton("Remove Person (by ID)"));
        operationsPanel.add(new JButton("Search Person (by ID)"));
        operationsPanel.add(new JButton("List All Persons"));
        operationsPanel.add(new JButton("Clear Form"));
        operationsPanel.add(new JButton("Find Persons by Name"));
        operationsPanel.add(new JButton("Check ID exists"));

        JPanel filterPanel = new JPanel(new GridLayout(5, 1, 2, 2));
        filterPanel.setBorder(BorderFactory.createTitledBorder("Search & Filter"));
        
        filterPanel.add(new JLabel("Enter ID to Search:"));
        JTextField txtSearchId = new JTextField("1001");
        filterPanel.add(txtSearchId);
        
        filterPanel.add(new JLabel("Filter by Age range:"));
        JTextField txtAgeRange = new JTextField("25-35");
        filterPanel.add(txtAgeRange);
        
        JPanel executePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JButton btnExecute = new JButton("Execute");
        executePanel.add(btnExecute);
        filterPanel.add(executePanel);

        rightPanel.add(operationsPanel);
        rightPanel.add(Box.createVerticalStrut(10));
        rightPanel.add(filterPanel);

        add(rightPanel, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Interfaz2().setVisible(true);
        });
    }
}
