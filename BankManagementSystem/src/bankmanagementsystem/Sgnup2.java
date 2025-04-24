package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Sgnup2 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
    JButton b;
    JRadioButton r1, r2, r3, r4;
    JTextField t1, t2, t3;
    JComboBox c1, c2, c3, c4, c5;
    String formno;

    Sgnup2(String formno) {
        this.formno = formno;

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        panel.add(l14);

        l1 = new JLabel("Page 2: Additonal Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));

        l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));

        l3 = new JLabel("Category:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));

        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));

        l5 = new JLabel("Educational");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));

        l11 = new JLabel("Qualification:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));

        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));

        l7 = new JLabel("PAN Number:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));

        l8 = new JLabel("CNIC Number:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));

        l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));

        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));

        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));

        l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);

        ButtonGroup seniorcititzen = new ButtonGroup();
        seniorcititzen.add(r1);
        seniorcititzen.add(r2);
        ButtonGroup existingaccount = new ButtonGroup();
        existingaccount.add(r3);
        existingaccount.add(r4);

        String religion[] = { "Muslim", "Hindu", "Sikh", "Christian", "Other" };
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));

        String category[] = {"General", "Sindhi", "Punjabi", "Pathan", "Balochi", "Other"};
        c2 = new JComboBox(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));

        String income[] = { "Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000" };
        c3 = new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));

        String education[] = { "Matric", "Intermediate", "Graduate", "Post Graduate", "Non graduate" };
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));

        String occupation[] = { "Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others" };
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));

        l12.setBounds(700, 10, 60, 30);
        panel.add(l12);

        l13.setBounds(760, 10, 60, 30);
        panel.add(l13);

        l1.setBounds(280, 30, 600, 40);
        panel.add(l1);

        l2.setBounds(100, 120, 100, 30);
        panel.add(l2);

        c1.setBounds(350, 120, 320, 30);
        panel.add(c1);

        l3.setBounds(100, 170, 100, 30);
        panel.add(l3);

        c2.setBounds(350, 170, 320, 30);
        panel.add(c2);

        l4.setBounds(100, 220, 100, 30);
        panel.add(l4);

        c3.setBounds(350, 220, 320, 30);
        panel.add(c3);

        l5.setBounds(100, 270, 150, 30);
        panel.add(l5);

        c4.setBounds(350, 270, 320, 30);
        panel.add(c4);

        l11.setBounds(100, 290, 150, 30);
        panel.add(l11);

        l6.setBounds(100, 340, 150, 30);
        panel.add(l6);

        c5.setBounds(350, 340, 320, 30);
        panel.add(c5);

        l7.setBounds(100, 390, 150, 30);
        panel.add(l7);

        t1.setBounds(350, 390, 320, 30);
        panel.add(t1);

        l8.setBounds(100, 440, 180, 30);
        panel.add(l8);

        t2.setBounds(350, 440, 320, 30);
        panel.add(t2);

        l9.setBounds(100, 490, 150, 30);
        panel.add(l9);

        r1.setBounds(350, 490, 100, 30);
        panel.add(r1);

        r2.setBounds(460, 490, 100, 30);
        panel.add(r2);

        l10.setBounds(100, 540, 180, 30);
        panel.add(l10);

        r3.setBounds(350, 540, 100, 30);
        panel.add(r3);

        r4.setBounds(460, 540, 100, 30);
        panel.add(r4);

        b.setBounds(570, 640, 100, 30);
        panel.add(b);

        b.addActionListener(this);

        panel.setPreferredSize(new Dimension(850, 800)); // Allow scroll

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setContentPane(scrollPane);

        setSize(850, 750);
        setLocation(200, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String religion = (String) c1.getSelectedItem();
        String category = (String) c2.getSelectedItem();
        String income = (String) c3.getSelectedItem();
        String education = (String) c4.getSelectedItem();
        String occupation = (String) c5.getSelectedItem();

        String pan = t1.getText();
        String cnic = t2.getText();

        String scitizen = "";
        if (r1.isSelected()) {
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eaccount = "";
        if (r3.isSelected()) {
            eaccount = "Yes";
        } else if (r4.isSelected()) {
            eaccount = "No";
        }

        try {
            if (t2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            } else {
                Conn c = new Conn();
                String query = "insert into signup2 values('" + formno + "','" + religion + "','" + category + "','"
                        + income + "','" + education + "','" + occupation + "','" + pan + "','" + cnic + "','"
                        + scitizen + "','" + eaccount + "')";
                c.s.executeUpdate(query);

                new signup3(formno).setVisible(true);
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Sgnup2("").setVisible(true);
    }
}
