package com.OriginsB;

import java.util.ArrayList;
public class Main {
	
public static boolean Tile_Needed = true; 
public static int Range = 5;
public static int Tiles = 0;
public static int Tiles_Needed = Range-Tiles;
public static ArrayList<Tile> TileArray = new ArrayList<Tile>(Range);
public static int LastTile = 0;

public static void main(String[] args){
CheckTiles.checkTiles();
}
}
