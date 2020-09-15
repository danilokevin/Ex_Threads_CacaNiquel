package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Controller implements ActionListener {
	
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JButton btnPlay;
	
	public Controller(JTextField textField, JTextField textField_1, JTextField textField_2, JButton btnJogar){
		this.txt1 = textField;
		this.txt2 = textField_1;
		this.txt3 = textField_2;
		this.btnPlay = btnJogar;
	}
	
	public void botaoCaca(){
		Thread campo1 = new ThreadCaca(this.txt1, this.btnPlay, 1);
		Thread campo2 = new ThreadCaca(this.txt2, this.btnPlay, 2);
		Thread campo3 = new ThreadCaca(this.txt3, this.btnPlay, 3);
		campo1.start();
		campo2.start();
		campo3.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		botaoCaca();
		
	}
	
	
	
	

}
