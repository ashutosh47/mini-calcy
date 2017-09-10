import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class MInicalcy {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MInicalcy window = new MInicalcy();
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
	public MInicalcy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	
	private void initialize() {
		frame = new JFrame("mini calculator");
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//frame.setText();
		
		JLabel lblNewLabel = new JLabel("num1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 28, 72, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("num2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 68, 72, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(107, 36, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 76, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBackground(UIManager.getColor(""));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=textField.getText();
				String s2=textField_1.getText();
				float n1=Float.parseFloat(s1);
				float n2=Float.parseFloat(s2);
				float an=n1+n2;
				String ans_str=Float.toString(an);
				textField_2.setText(ans_str);
				}
		});
		btnNewButton.setBounds(10, 126, 103, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBackground(UIManager.getColor(""));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=textField.getText();
				String s2=textField_1.getText();
				float n1=Float.parseFloat(s1);
				float n2=Float.parseFloat(s2);
				float an=n1-n2;
				String ans_str=Float.toString(an);
				textField_2.setText(ans_str);
			}
		});
		btnNewButton_1.setBounds(109, 126, 103, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.setBackground(UIManager.getColor(""));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=textField.getText();
				String s2=textField_1.getText();
				float n1=Float.parseFloat(s1);
				float n2=Float.parseFloat(s2);
				float an=n1*n2;
				String ans_str=Float.toString(an);
				textField_2.setText(ans_str);
				}
		});
		btnNewButton_2.setBounds(213, 126, 108, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBackground(UIManager.getColor(""));
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=textField.getText();
				String s2=textField_1.getText();
				float n1=Float.parseFloat(s1);
				float n2=Float.parseFloat(s2);
				float an=n1/n2;
				String ans_str=Float.toString(an);
				textField_2.setText(ans_str);
				}
		});
		btnNewButton_3.setBounds(321, 126, 103, 41);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("result");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(22, 212, 86, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(152, 212, 86, 38);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("c");
		btnNewButton_4.setBackground(Color.red);
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("");
				textField_1.setText("");
				textField.setText("");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton_4.setBounds(301, 186, 80, 64);
		frame.getContentPane().add(btnNewButton_4);
		
		
	
		
	}
	
}
