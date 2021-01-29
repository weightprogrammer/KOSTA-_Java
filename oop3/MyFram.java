package kosta.oop3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.nio.Buffer;

public class MyFram extends Frame implements ActionListener, WindowListener{

	public MyFram() {
		Button b =new Button("button");
		add(b);
		b.addActionListener(this);
		
		
		setSize(300, 200);
		setLocation(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFram();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button)e.getSource();
		String lable = b.getLabel();
		System.out.println(lable + "º±≈√");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
