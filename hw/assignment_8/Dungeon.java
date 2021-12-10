//***********************************************************  
// Name: Jose Solis
// Title: Dungeon.java  
// Description:  
// Date: 12/2/21
//********************************************************** 

// ===== start PART 1 =====
//
// A) in.useDelimiter ("[^A-Za-z]+")
// Rect x y Width Height Rect x y Width Height
// B) in.useDelimiter ("[^0-9]+")
// 0 0 10 20 100 5 125 2 20 7 10 0
// C) in.useDelimiter ("[^0-9]*")
// 0 0 1 0 2 0 1 0 0 5 1 2 5 2 2 0 7 1 0 0
// D) in.useDelimiter ("[0-9]+")
// Rect x       y       Width     Height
// Rect x  .  y  .  Width  .  Height  .
// E) in.useDelimiter ("[^0-9.0-9]+")
// 
// ===== end PART 1 =====

import java.lang.Math;

public class Dungeon{
	private Monster[][] monsters;
	public int gridWidth;
	public int gridHeight;

	public Dungeon(int width, int height){
		this.gridWidth = width;
		this.gridHeight = height;
		monsters = new Monster[height][width]; // height is rows and width is columns
		// fill 2d array with default monsters starting from top left going right to bottom right
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				monsters[i][j] = new Monster();
			}
		}
	}

	public void updateMonster(int x, int y, Monster m){
		if(!(x >= this.gridWidth || y >= this.gridHeight)){
			Monster toUpdate = this.monsters[y][x];
			if(toUpdate.getName().equals("") && toUpdate.getLevel() == -1){
				this.monsters[y][x] = m;
			}	
		}

	}
	
	private void swap(int x1, int y1, int x2, int y2){
		Monster mike = this.monsters[y1][x1];
		this.monsters[y1][x1] = this.monsters[y2][x2];
		this.monsters[y2][x2] = mike;
	}

	public void shuffle(){
		for(int i = 0; i < this.gridHeight; i++){
			for(int j = 0; j < this.gridWidth; j++){
				int row = ((int) Math.random() * this.gridHeight);
				int col = ((int) Math.random() * this.gridWidth);

				swap(i, j, row, col);
			}
		}
	}

	public void shift(char command){
		final char up = 'w';
		final char down = 's';
		final char left = 'a';
		final char right = 'd';

		Monster previous = null;

		if(command == up){
			int start = 0;
			// from left to right
			for(int i = 0; i < this.gridWidth; i++){
				// move monsters, do nothing with this return
				moveUp(start, i);
			}
		}
		else if(command == down){
			int start = this.gridHeight - 1;
			// from left to right
			for(int i = 0; i < this.gridWidth; i++){
				// move monsters, do nothing with this return
				moveDown(start, i);
			}
		}
		else if(command == right){
			int start = this.gridWidth - 1;
			// from top to bottom
			for(int i = 0; i < this.gridHeight; i++){
				// move monsters, do nothing with the last monster returned
				Monster rightend = moveRight(i, start);
			}
		}
		else if(command == left){
			int start = 0;
			// from top to bottom
			for(int i = 0; i < this.gridHeight; i++){
				// move monsters, do nothing with the last monster returned
				Monster leftend = moveLeft(i, start);
			}
		}
	}

	public String printInfo(){
		String info = "\n";

		for(int i = 0; i < this.gridHeight; i++){
			info+="\t";
			for(int j = 0; j < this.gridWidth; j++){
				info+=this.monsters[i][j].getInfo() + " ";
			}
			info+="\n";
		}

		return info;
	}

	// ===== not in assignment but they help complete the HW =====
	// Start from row = 0
	private Monster moveUp(int row, int col){
		Monster toReturn = null;
		
		if(row + 1 < this.gridHeight){
			Monster replace = moveUp(row + 1, col);
			toReturn = this.monsters[row][col];
			this.monsters[row][col] = replace;
		}
		else{
			toReturn = this.monsters[row][col];
			this.monsters[row][col] = this.monsters[0][col];
		}
		return toReturn;

	}
	// start with row = this.gridHeight - 1
	private Monster moveDown(int row, int col){
		Monster toReturn = null;

		if(row - 1 >= 0){
			Monster replace = moveDown(row - 1, col);
			toReturn = this.monsters[row][col];
			this.monsters[row][col] = replace;
		}
		else{
			toReturn = this.monsters[row][col];
			this.monsters[row][col] = this.monsters[this.gridHeight - 1][col];
		}

		return toReturn;

	}
	// start with col = 0
	private Monster moveLeft(int row, int col){
		Monster toReturn = null;
		
		if(col + 1 < this.gridWidth){
			Monster replace = moveLeft(row, col + 1);
			toReturn = this.monsters[row][col];
			this.monsters[row][col] = replace;
		}
		else{
			toReturn = this.monsters[row][col];
			this.monsters[row][col] = this.monsters[row][0];
		}
		return toReturn;

	}
	// start with col = this.gridWidth - 1
	private Monster moveRight(int row, int col){
		Monster toReturn = null;
		
		if(col - 1 >= 0){
			Monster replace = moveRight(row, col - 1);
			toReturn = this.monsters[row][col];
			this.monsters[row][col] = replace;
		}
		else{
			toReturn = this.monsters[row][col];
			this.monsters[row][col] = this.monsters[row][this.gridWidth - 1];
		}
		return toReturn;

	}
}

