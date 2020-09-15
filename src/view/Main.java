package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Controller;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;

public class Main extends JFrame {

	private JPanel contentPane;
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
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 60));
		textField.setBounds(59, 72, 86, 108);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLUE);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 60));
		textField_1.setBounds(170, 72, 86, 108);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.MAGENTA);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 60));
		textField_2.setBounds(283, 72, 86, 108);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.setBounds(170, 204, 89, 23);
		contentPane.add(btnJogar);
		
		Controller jogada = new Controller(textField, textField_1, textField_2, btnJogar);
		
		JLabel lblCaaNquel = new JLabel("Ca\u00E7a N\u00EDquel");
		lblCaaNquel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblCaaNquel.setForeground(Color.GREEN);
		lblCaaNquel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaaNquel.setBounds(59, 11, 310, 50);
		contentPane.add(lblCaaNquel);
		btnJogar.addActionListener(jogada);
	
	}
}
