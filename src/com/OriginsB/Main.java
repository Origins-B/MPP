package com.OriginsB;

import java.util.ArrayList;

public class Main {
    public static int range = 5;
    static ArrayList<Tile> tilearr = new ArrayList<Tile>();
	public static void main(String[] args) {
    for(int i=range; i>0; i++){
    tilearr.add(new Tile(i+1, i));
    }
    for (Tile var : tilearr) {
    	var.getTile();
    }
	}

}
