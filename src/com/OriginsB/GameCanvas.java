package com.OriginsB;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.*;

public class GameCanvas  extends JFrame{
public static JButton generate = new JButton();
public static Action generate_Action = new AbstractAction("Generate Tiles"){
	public void actionPerformed(ActionEvent e){
		try{
		GenerateTile.generateTile(((Number)NumberFormat.getInstance().parse(field1.getText())).intValue(),((Number)NumberFormat.getInstance().parse(field2.getText())).intValue());
		}
		catch(ParseException Exception){
			System.out.println("Woops, The input wasn't a number.");
		}
	}
};

public static JButton Random = new JButton();
public static Action GenerateRandom = new AbstractAction(){
	public void actionPerformed(ActionEvent e){
		
	}
};

JPanel row1 = new JPanel(new GridLayout(5,2));
JPanel row2 = new JPanel(new FlowLayout());
JPanel MainPanel = new JPanel(new GridLayout());
static JTextField field1 = new JTextField("Material");
static JTextField field2 = new JTextField("Position");
public GameCanvas(){
	super();
	MainPanel.add(row1);
	MainPanel.add(row2);
	this.setSize(380, 380*10/16);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	row2.add(generate);
	row1.add(field1);
	row1.add(field2);
	generate.setAction(generate_Action);
	this.getContentPane().add(MainPanel);
}
public void setVis(boolean v){
this.setVisible(v);
}
}
