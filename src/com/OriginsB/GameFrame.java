package com.OriginsB;
import javax.swing.*;
public class GameFrame extends JFrame{
JTextField field1 = new JTextField();
public GameFrame(){
	super();
	this.setFocusable(true);
	this.setSize(480, 360);
	this.add(Main.canvas);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
