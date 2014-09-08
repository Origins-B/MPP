package com.OriginsB;

public class Tile {
	
private int ID;
private int Pos;
	
public Tile(int ident, int Position){
	Pos = Position;
	ID = ident;
}

@Override
public String toString(){
	return "Tile with ID: "+ID+" with pos: "+Pos;
}
}
