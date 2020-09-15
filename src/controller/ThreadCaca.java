package controller;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ThreadCaca extends Thread{
	
	private JTextField campo;
	private int id;
	private JButton play;
	
	public ThreadCaca(JTextField txt, JButton play, int id){
		this.campo = txt;
		this.play = play;
		this.id = id;
	}
	
	@Override
	public void run() {
		this.play.setEnabled(false);
		
		Random num = new Random();
		String roda = "";
		
		for(int i = 0; i <= this.id*500; i++){
			int limite = num.nextInt(150) + 1;
			for(int j = 0; j < limite; j++){
				int sorteio = num.nextInt(7)+1;
				//roda += sorteio;
				this.campo.setText(Integer.toString(sorteio));
			}
		}
		
		this.play.setEnabled(true);
		//this.campo.setText(Integer.toString(sorteio));
	}

}
