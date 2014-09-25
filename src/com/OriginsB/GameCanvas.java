package com.OriginsB;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
@SuppressWarnings("serial")
public class GameCanvas extends JPanel{
static int XPos = 0;
static int YPos = 0;
public GameCanvas(){
	super();
	setSize(480,320);
	setVisible(true);
    this.setBackground(Color.BLACK);
}
public void paint(Graphics g){
    BufferedImage img = null;
    try {
		img = ImageIO.read(getClass().getResource("/images/mario.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
    g.drawImage(img, XPos, YPos, 32, 32, null);
    }
}
