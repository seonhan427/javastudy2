package Calculator;

import java.awt.*;
import javax.swing.*;

public class CalculatorLayout extends JFrame {
	
	public CalculatorLayout() {
		
		
		setSize(716, 340);
		setTitle("Calculator");
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.white);
		
		JPanel Number = new JPanel();
		Number.setBackground(Color.white);
		JPanel NumberButton = new JPanel();
		
		Number.setBounds(0,0,720,30);
		
		GridLayout gl = new GridLayout(5,5,2,2);
		NumberButton.setLayout(gl);
		JLabel label = new JLabel("0");
		label.setForeground(Color.LIGHT_GRAY);
		NumberButton.setBounds(0,30,700,270);
		
		JButton b1 = new JButton("Backspace");
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.blue);
		
		JButton b2 = new JButton("");
		b2.setBackground(Color.yellow);
		
		JButton b3 = new JButton("");
		b3.setBackground(Color.yellow);
		
		JButton b4 = new JButton("CE");
		b4.setBackground(Color.yellow);
		b4.setForeground(Color.red);
		
		JButton b5 = new JButton("C");
		b5.setBackground(Color.yellow);
		b5.setForeground(Color.red);
		
		JButton b6 = new JButton("7");
		b6.setBackground(Color.yellow);
		b6.setForeground(Color.blue);
		
		JButton b7 = new JButton("8");
		b7.setBackground(Color.yellow);
		b7.setForeground(Color.blue);
		
		JButton b8 = new JButton("9");
		b8.setBackground(Color.yellow);
		b8.setForeground(Color.blue);
		
		JButton b9 = new JButton("/");
		b9.setBackground(Color.yellow);
		b9.setForeground(Color.red);
		
		JButton b10 = new JButton("sqrt");
		b10.setBackground(Color.yellow);
		b10.setForeground(Color.red);
		
		JButton b11 = new JButton("4");
		b11.setBackground(Color.yellow);
		b11.setForeground(Color.blue);
		
		JButton b12 = new JButton("5");
		b12.setBackground(Color.yellow);
		b12.setForeground(Color.blue);
		
		JButton b13 = new JButton("6");
		b13.setBackground(Color.yellow);
		b13.setForeground(Color.blue);
		
		JButton b14 = new JButton("X");
		b14.setBackground(Color.yellow);
		b14.setForeground(Color.red);
		
		JButton b15 = new JButton("%");
		b15.setBackground(Color.yellow);
		b15.setForeground(Color.red);
		
		JButton b16 = new JButton("1");
		b16.setBackground(Color.yellow);
		b16.setForeground(Color.blue);
		
		JButton b17 = new JButton("2");
		b17.setBackground(Color.yellow);
		b17.setForeground(Color.blue);
		
		JButton b18 = new JButton("3");
		b18.setBackground(Color.yellow);
		b18.setForeground(Color.blue);
		
		JButton b19 = new JButton("-");
		b19.setBackground(Color.yellow);
		b19.setForeground(Color.red);
		
		JButton b20 = new JButton("1/x");
		b20.setBackground(Color.yellow);
		b20.setForeground(Color.red);
		
		JButton b21 = new JButton("0");
		b21.setBackground(Color.yellow);
		b21.setForeground(Color.blue);
		
		JButton b22 = new JButton("+/-");
		b22.setBackground(Color.yellow);
		b22.setForeground(Color.blue);
		
		JButton b23 = new JButton(".");
		b23.setBackground(Color.yellow);
		b23.setForeground(Color.blue);
		
		JButton b24 = new JButton("+");
		b24.setBackground(Color.yellow);
		b24.setForeground(Color.red);
		
		JButton b25 = new JButton("=");
		b25.setBackground(Color.yellow);
		b25.setForeground(Color.red);
		
		Number.add(label);
		NumberButton.add(b1);
		NumberButton.add(b2);
		NumberButton.add(b3);
		NumberButton.add(b4);
		NumberButton.add(b5);
		NumberButton.add(b6);
		NumberButton.add(b7);
		NumberButton.add(b8);
		NumberButton.add(b9);
		NumberButton.add(b10);
		NumberButton.add(b11);
		NumberButton.add(b12);
		NumberButton.add(b13);
		NumberButton.add(b14);
		NumberButton.add(b15);
		NumberButton.add(b16);
		NumberButton.add(b17);
		NumberButton.add(b18);
		NumberButton.add(b19);
		NumberButton.add(b20);
		NumberButton.add(b21);
		NumberButton.add(b22);
		NumberButton.add(b23);
		NumberButton.add(b24);
		NumberButton.add(b25);
		

		add(Number, BorderLayout.NORTH);
		add(NumberButton, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CalculatorLayout C = new CalculatorLayout();
	}

}
