package com.OriginsB;

import java.awt.*;
public class GameCanvas  extends Canvas{
boolean X = true;
boolean Y = true;
int executed = 0;
static int XPos = 0;
static int YPos = 0;
public GameCanvas(){
	super();
	this.setSize(480,360);
}
public void paint(Graphics g){
	g.drawRect(XPos, YPos, 80, 80);
	g.fillRect(XPos, YPos, 80, 80);
}
public void moveRect(){
	super.paint(getGraphics());
	if(X){
		if(XPos >= 400){
			X=false;
		}
		XPos++;
	}
	else{
		XPos--;
		if(XPos <= 0){
			X=true;
		}
	}
	if(Y){
		YPos++;
		if(YPos>260){
			Y=false;
		}
		
	}
	else{
		YPos--;
		if(YPos<=0){
			Y=true;
		}
	}
	repaint();
}
}
