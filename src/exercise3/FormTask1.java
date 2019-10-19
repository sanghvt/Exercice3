/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author sang
 */
public class FormTask1 extends JFrame implements ActionListener{
    
    JTextField inputA, inputB;
    JTextArea outPut;
    JButton ok,clear;

    public FormTask1(String title) throws HeadlessException {
        super(title);
        inputA = new JTextField();
        inputB = new JTextField();
        ok = new JButton("OK");
        clear = new JButton("CLEAR");
        outPut = new JTextArea();
        outPut.append("Result:");
        JLabel a = new JLabel("Enter a");
        JLabel b = new JLabel("Enter b");
        
        
        inputB.setBounds(400,300,100,30);
        inputA.setBounds(200,300,100,30);
        ok.setBounds(200, 400, 100, 30);
        clear.setBounds(325,400,100,30);
        a.setBounds(125,300,100,30);
        b.setBounds(325,300,100,30);
        
        
        add(ok);
        ok.setActionCommand("ok");
        ok.addActionListener(this);
        add(clear);
        clear.setActionCommand("clear");
        clear.addActionListener(this);
        add(a);
        add(b);
        add(inputA);
        add(inputB);
        add(outPut);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }  

    @Override
    public void actionPerformed(ActionEvent arg0) {
        String command = arg0.getActionCommand();
        if(command.equals("ok")){
            try{
                int a = Integer.parseInt(inputA.getText());
                int b = Integer.parseInt(inputB.getText());
                outPut.append("\nSum : "+ Calculator.sum(a, b));
                outPut.append("\nSub : "+ Calculator.sub(a, b));
                outPut.append("\nMul : "+ Calculator.mul(a, b));
                outPut.append("\nDiv : "+ Calculator.div(a, b));
                outPut.append("\nUCLN : "+ Calculator.UCLN(a, b));
                outPut.append("\nBCNN : "+ Calculator.BCNN(a, b));
               
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, "Enter a and b are Integer");
            }
        }
        
        if(command.equals("clear")){
            inputA.setText("");
            inputB.setText("");
            outPut.setText("");
        }
    }
}
