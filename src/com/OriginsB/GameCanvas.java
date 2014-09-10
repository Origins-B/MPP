package com.OriginsB;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameCanvas  extends JFrame{
public static JButton generate = new JButton();
public static Action generate_Action = new AbstractAction("Generate Tiles"){
	public void actionPerformed(ActionEvent e){
		GenerateTile.generateTile(10, 0);
	}
};
JPanel row1 = new JPanel();
JPanel row2 = new JPanel();
public GameCanvas(){
	super();
	this.setSize(380, 380*10/16);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	row2.add(generate);
	this.add(row1);
	row1.setLayout(new FlowLayout());
	row2.setLayout(new FlowLayout());
	generate.setAction(generate_Action);
}
public void setVis(boolean v){
this.setVisible(v);
}
}
