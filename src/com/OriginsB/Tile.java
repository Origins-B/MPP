package com.OriginsB;

public class Tile {
	
public static int ID;
public static int Pos;
	
public Tile(int ident, int Position){
	Pos = Position;
	ID = ident;
}

public static void getTile(){
System.out.print("Tile ID: "+ID+" with pos: "+Pos);
}
}
