package com.OriginsB;

import java.awt.Color;


public class Main {
static GameCanvas canvas = new GameCanvas();
public static boolean running = true;
static GameFrame frame = new GameFrame();
public static void main(String[] args){
frame.setContentPane(canvas);
canvas.setFocusable(true);
}
public static void GameLoop(){
	System.out.println(GameCanvas.XPos+"=="+GameCanvas.YPos);
	frame.setBackground(Color.BLACK);
	canvas.repaint();
}
}