package com.OriginsB;

public class CheckTiles {
public static void checkTiles(){
while(Main.Tile_Needed=true){
	Main.TileArray.add(GenerateTile.generateTile(Main.LastTile+1, Main.LastTile));
	Main.LastTile+=1;
}
}
}
