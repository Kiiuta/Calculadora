package pacote1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Calculadora2 {

	private JFrame frame;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora2 window = new Calculadora2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 435, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDisplay.setBounds(12, 13, 393, 37);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		//----------------Linha 1
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(94, 164, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(160, 164, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn9 .getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(224, 164, 50, 50);
		frame.getContentPane().add(btn9);
		// --------------- linha 2
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(94, 223, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(160, 223, 50, 50);
		frame.getContentPane().add(btn5);
		//---------------------linha3
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(224, 223, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(94, 286, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(160, 286, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(224, 286, 50, 50);
		frame.getContentPane().add(btn1);
		//---------------- linha 4
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(94, 345, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(160, 345, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// aki  objetivo é executar as operações matematicas e determinar um resultado
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations == "+") {
				
					result = firstnum + secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if (operations == "-") {
				
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if (operations == "*") {
				
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if (operations == "/") {
					
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if (operations == "%") {
					
					result = firstnum % secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				else if (operations == "") {
					
				}
				
				
				
				
				
				
				
				
			}	
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.
		setBounds(303, 345, 50, 50);
		frame.getContentPane().add(btnEqual);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);

			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(303, 63, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(303, 120, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(303, 183, 50, 31);
		frame.getContentPane().add(btnSub);
		
		JButton btn9_4 = new JButton("/");
		btn9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btn9_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9_4.setBounds(303, 223, 50, 50);
		frame.getContentPane().add(btn9_4);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(303, 286, 50, 50);
		frame.getContentPane().add(btnMult);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.setBounds(19, 63, 45, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("off");
		rdbtnOff.setBounds(19, 93, 45, 25);
		frame.getContentPane().add(rdbtnOff);
		
		JButton btnBackSpace = new JButton("<--");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				
				if (txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBackSpace.setBounds(94, 106, 116, 40);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnPM = new JButton("/u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPM.setBounds(224, 345, 50, 50);
		frame.getContentPane().add(btnPM);
		
		JButton btnPrecent = new JButton("%");
		btnPrecent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
				
			}
		});
		btnPrecent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPrecent.setBounds(224, 101, 60, 50);
		frame.getContentPane().add(btnPrecent);
		
	
		
	
		
		
		
		
		
		
		
		
		
		
	}
}
