package AWT;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame {
	MyFrame()
	{
		setVisible(true);
		setSize(300,300);
		setBackground(Color.BLACK);
		setTitle("Mahesh");
	}

	public static void main(String[] args) {
		MyFrame m=new MyFrame();
		
	}

}
