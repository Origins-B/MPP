package com.OriginsB;

public class GenerateTile {
public static Tile generateTile(int ID,int Pos){
	System.out.println("Generated Tile with ID "+ID+" with Pos: "+Pos);
	return new Tile(ID,Pos);	
}
}
