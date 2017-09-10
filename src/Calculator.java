import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Point;
import javax.swing.border.TitledBorder;
import javax.swing.text.JTextComponent;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator{

	private JFrame frmCalculator;
	private JTextField txtFdfdf;

	double num,ans;
    int calculation;
	/**
	 * Launch the application.
	 */
	public void enable()
	{
		txtFdfdf.setEnabled(true);
	}
	public void disable()
	{
		txtFdfdf.setEnabled(false);
	//	button1.setEnabled(false);
		
	}

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setBackground(new Color(204, 204, 204));
		frmCalculator.getContentPane().setBackground(new Color(51, 51, 102));
		frmCalculator.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setLocation(new Point(500, 250));
		frmCalculator.setLocationByPlatform(true);
		frmCalculator.setLocation(new Point(500, 250));
		frmCalculator.setBounds(100, 100, 289, 351);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		txtFdfdf = new JTextField();
		txtFdfdf.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFdfdf.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtFdfdf.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtFdfdf.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null)));
		txtFdfdf.setBounds(10, 11, 253, 34);
		frmCalculator.getContentPane().add(txtFdfdf);
		txtFdfdf.setColumns(10);
		
		JButton btnNewButton = new JButton("c");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtFdfdf.setText("0");}
		});
		btnNewButton.setBounds(10, 80, 54, 34);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnOn = new JRadioButton("ON");
		rdbtnOn.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnOn.setBounds(171, 80, 46, 23);
		frmCalculator.getContentPane().add(rdbtnOn);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnOff.setBounds(216, 80, 46, 23);
		frmCalculator.getContentPane().add(rdbtnOff);
		
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    txtFdfdf.setText(txtFdfdf.getText()+"1");			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(10, 124, 54, 34);
		frmCalculator.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtFdfdf.setText(txtFdfdf.getText()+"2");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(74, 124, 54, 34);
		frmCalculator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFdfdf.setText(txtFdfdf.getText()+"3");}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(138, 124, 54, 34);
		frmCalculator.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFdfdf.setText(txtFdfdf.getText()+"4");}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.setBounds(10, 169, 54, 34);
		frmCalculator.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFdfdf.setText(txtFdfdf.getText()+"5");}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBounds(74, 169, 54, 34);
		frmCalculator.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFdfdf.setText(txtFdfdf.getText()+"7");}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_5.setBounds(10, 214, 54, 34);
		frmCalculator.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("9");
		button_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtFdfdf.setText(txtFdfdf.getText()+"9");}
		});
		
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.setBounds(138, 214, 54, 34);
		frmCalculator.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFdfdf.setText(txtFdfdf.getText()+"8");}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_7.setBounds(74, 214, 54, 34);
		frmCalculator.getContentPane().add(button_7);
		
		JButton button_8 = new JButton(".");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFdfdf.setText(txtFdfdf.getText()+".");}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_8.setBounds(202, 259, 54, 34);
		frmCalculator.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFdfdf.setText(txtFdfdf.getText()+"6");}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_9.setBounds(138, 169, 54, 34);
		frmCalculator.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFdfdf.setText(txtFdfdf.getText()+"0");}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_10.setBounds(202, 214, 54, 34);
		frmCalculator.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(txtFdfdf.getText());
				calculation=3;
				txtFdfdf.setText("*");
			}		
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_11.setBounds(202, 124, 54, 34);
		frmCalculator.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(txtFdfdf.getText());
				calculation=4;
			
				txtFdfdf.setText("/");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_12.setBounds(202, 169, 54, 34);
		frmCalculator.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("+");
		button_13.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
			
				
			//txtFdfdf.setText(txtFdfdf.getText()+"+");

			txtFdfdf.setText("+");
			
			
			
			
				
			}
			
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_13.setBounds(10, 259, 54, 34);
		frmCalculator.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
								txtFdfdf.setText("-");
				}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_14.setBounds(74, 259, 54, 34);
		frmCalculator.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("<<");
		button_15.addActionListener(new ActionListener() {
			 
			public void actionPerformed(ActionEvent e) {
			int length=txtFdfdf.getText().length();
			int number=txtFdfdf.getText().length()-1;
			String store;
			if (length>0)
			{
			  StringBuilder back=new StringBuilder(txtFdfdf.getText());
			  back.deleteCharAt(number);
			  store=back.toString();
			  txtFdfdf.setText(store);
			}
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_15.setBounds(74, 80, 81, 34);
		frmCalculator.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("=");
		button_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_16.setBounds(138, 259, 54, 34);
		frmCalculator.getContentPane().add(button_16);
		
		button_16.addActionListener(new ActionListener() {
			
			    public void actionPerformed(ActionEvent e) {
				
			    	
			    		 if(ans==num+Double.parseDouble(txtFdfdf.getText()))
			   
			    		  txtFdfdf.setText(Double.toString(ans));
			    		  num=Double.parseDouble(txtFdfdf.getText());
			    		  
			    		if(ans==num-Double.parseDouble(txtFdfdf.getText()))
			    		  
			    		  txtFdfdf.setText(Double.toString(ans));
			    		  num=Double.parseDouble(txtFdfdf.getText());
			    		if(ans==num*Double.parseDouble(txtFdfdf.getText()))
			    	      
			    		  txtFdfdf.setText(Double.toString(ans));
			    		  num=Double.parseDouble(txtFdfdf.getText());
			    		  
			    		if(ans==num/Double.parseDouble(txtFdfdf.getText()))
			    			//ans=num/Double.parseDouble(txtFdfdf.getText());
			    			txtFdfdf.setText(Double.toString(ans));
			    			num=Double.parseDouble(txtFdfdf.getText());
			    
			             }
			    	
			    	//arithmatic();
				//arithmatic();
				
		});
		
		JLabel lblone = new JLabel("");
		lblone.setHorizontalAlignment(SwingConstants.CENTER);
		lblone.setBackground(Color.WHITE);
		lblone.setForeground(Color.RED);
		lblone.setBounds(202, 47, 46, 23);
		frmCalculator.getContentPane().add(lblone);
		//lblone.setText(num+"+");
		
		
		
			}
}
