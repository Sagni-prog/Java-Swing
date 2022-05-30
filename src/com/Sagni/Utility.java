package com.Sagni;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Utility extends JFrame {

    JButton btnConv, btnBmi,button, btnClose, btnYES, btnNO;
    JLabel labeler, labeler2,label, label1, label2, label3, label4, l;
    JTextField field1, field2, field3;
    String text = "You need to see your docter";
    String lab = "Do You Want To Close?";
    String yes = "YES";
    String no = "NO";
    String conv = "Converter";
    String labb = "Chose the following choices";
    public Utility() {
       this.setSize(300,400);
       this.setLocationRelativeTo(null);
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("Langueges");
        JMenuItem Oromic = new JMenuItem("Oromic");
        Oromic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Oromic_Lang();
            }
        });
        file.add(Oromic);
        JMenuItem English = new JMenuItem("English");
        English.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                English_Lang();
            }
        });
        file.add(English);
        JMenuItem Open = new JMenuItem("Open");
        Open.setModel(new JToggleButton.ToggleButtonModel());
        mb.add(file);
        this.setJMenuBar(mb);
        JPanel panel = new JPanel();
        JButton btnConv = new JButton(conv);
        //this.add(btnConv);
        JButton btnBmi = new JButton("BMI");
        btnBmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BMI();
            }
        });
        JLabel space = new JLabel("                         " +
                "" +
                "                                              " +
                "                                                                                                                                                                                                                                                                                                                                           ");
      JLabel label = new JLabel("              "+labb+"               ");
        panel.add(space);
        panel.add(label);
        panel.add(btnConv);
        panel.add(btnBmi);
        panel.setBackground(Color.BLACK);
        this.add(panel,BorderLayout.CENTER);
        this.setVisible(true);
    }

      void  BMI() {

         JFrame frame = new JFrame();
            frame.setSize(300, 400);
            frame.setLocationRelativeTo(null);
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout(50, 50));
            panel.setBorder(new EmptyBorder(30, 10, 10, 10));
            panel.setLayout(new GridLayout(3, 2));
            field1 = new JTextField();
            label1 = new JLabel("Weight(in kg):");
            panel.add(label1);
            panel.add(field1);
            field2 = new JTextField();
            label2 = new JLabel("Height(in m):");
            panel.add(label2);
            panel.add(field2);
            field3 = new JTextField();
            field3.setEditable(false);
            label3 = new JLabel("Your BMI is:");
            panel.add(label3);
            panel.add(field3);
            frame.add(panel, BorderLayout.NORTH);
            JPanel pane = new JPanel();
            button = new JButton("Compute");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double w = Double.parseDouble(field1.getText());
                    double h = Double.parseDouble(field2.getText());

                   int bmi = (int) Compute(w, h);
                    if (bmi < 18) {
                    }
                    field3.setText("" + bmi);
                }
            });
            pane.add(button);
            frame.add(pane, BorderLayout.CENTER);
            panel.setBackground(Color.cyan);
            btnClose = new JButton("EXIT");
            pane.add(btnClose);
            btnClose.addActionListener(e -> Close());
            label4 = new JLabel("Choose Language Of Your Choice                ");
            pane.add(label4);
            JRadioButton r = new JRadioButton("Oromic", false);
          r.addActionListener(e -> Oromic_Lang());
           pane.add(r);
           JRadioButton rb = new JRadioButton("English", false);
             pane.add(rb);
             rb.getDisabledSelectedIcon();
             rb.addActionListener(e -> English_Lang());
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setVisible(true);
            pane.setBackground(Color.cyan);

        }

        double Compute(double weight, double height) {

            return weight / (height * height);
        }
    //To change to English
    void English_Lang(){
        label1.setText("Weight(in kg):)");
        label2.setText("Height(m tiin):");
        label3.setText("Your BMI is:");
        button.setText("Compute");
        btnClose.setText("EXIT");
        text = "You need to see your doctor";
        lab  = "DO You Wan TO Exit?";
        yes = "YES";
        no = "NO";
        label4.setText("         Choose Language Of Your Choice        ");
        conv = "Converter";
        labb = "Chose the following choices";
    }
          //To change to Oromic
    void Oromic_Lang(){
        label1.setText("Ulfaatina(kg tiin):");
        label2.setText("Hora(m tiin):");
        label3.setText("BMI kee  :");
        button.setText("Herreegi");
        btnClose.setText("BAHI");
        text = "Dooktera kee ilaaluu qabda";
        lab = "Bahuu Barbaadda?";
        yes = "EEYYEE";
        no = "LAKKI";
        label4.setText("                   Afaan Barbaade Filadhu                      ");
        conv = "Jijjiirtuu";
        labb = "FIlanno armaangadii kessa filadhu";
    }
              //Method to Exit the window
    void Close(){
        JFrame f = new JFrame();
        f.setSize(300,400);
        f.setLocationRelativeTo(this);
        f.setVisible(true);
        l = new JLabel("" + lab);
        JPanel cont = new JPanel();
        cont.add(l);
        cont.setBackground(Color.pink);
        f.add(cont,BorderLayout.NORTH);
        JPanel pane = new JPanel();
        pane.setLayout(new FlowLayout());
        pane.setBackground(Color.pink);
        btnYES = new JButton("" + yes);
        btnYES.setBackground(Color.red);
        btnYES.addActionListener(e -> System.exit(0));
        btnNO = new JButton("" + no);
        btnNO.setBackground(Color.green);
        btnNO.addActionListener(e ->  BMI());
        pane.add(btnYES);
        pane.add(btnNO);
        f.add(pane, BorderLayout.CENTER);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
           void Converter(){
          JFrame fram = new JFrame();
          fram.setSize(300,400);
          fram.setLocationRelativeTo(this);
          fram.setVisible(true);
          fram.setDefaultCloseOperation(EXIT_ON_CLOSE);
           }

    public static void main(String[] args) {
            new Utility();
        }

    }
