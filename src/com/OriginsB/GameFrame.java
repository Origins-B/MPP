package com.OriginsB;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class GameFrame extends JFrame implements KeyListener{
JTextField field1 = new JTextField();
public GameFrame(){
	super();
	setFocusable(true);
	setSize(480, 320);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	addKeyListener(this);
    setBackground(Color.BLACK);
}
@Override
public void keyTyped(KeyEvent e) {
	
}
@Override
public void keyPressed(KeyEvent e) {
	switch(e.getKeyCode()){
	case KeyEvent.VK_DOWN: GameCanvas.YPos+=5; break;
	case KeyEvent.VK_UP: GameCanvas.YPos-=5; break;
	case KeyEvent.VK_RIGHT: GameCanvas.XPos=GameCanvas.XPos+5; break;
	case KeyEvent.VK_LEFT: GameCanvas.XPos-=5; break;
	case KeyEvent.VK_SPACE: Main.canvas.repaint();
	}
}
@Override
public void keyReleased(KeyEvent e) {
	
}
}
