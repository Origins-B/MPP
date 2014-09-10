package com.OriginsB;

public class CheckTiles {
public static void checkTiles(int run){
int runs = run;
for(int i = 0; i<runs; i++){
	Utils.TileArray.add(GenerateTile.generateTile(i+1, i));
}
}
}
