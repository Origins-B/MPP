package com.OriginsB;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
public class Main {
static GameCanvas canvas = new GameCanvas();
public static boolean running = true;
public static void main(String[] args) throws InterruptedException{
GameFrame frame = new GameFrame();
while(running){
Thread.sleep(10);
canvas.moveRect();
}
}
}
