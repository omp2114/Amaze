//package codeGeneration.fred;

import java.awt.Point;


public class Matrix {

	private int start_x;
	private int start_y;
	private int end_x;
	private int end_y;
	
	private boolean[][] tiles;
	
	public Matrix(int width, int length){

		tiles = new boolean[width][length];
		//initialize with falses
		for (int i=0; i<width; i++){
			for (int j=0; j<length; j++){
				tiles[i][j] = false;
			}
		}
	}
	
	public void insertPath(Point startPoint, String dir, int pathLength){
		int startX = (int) startPoint.getX();
		int startY = (int) startPoint.getY();
	
		//TODO check whether startPoint is valid
		
		int endX = startX; 
		int endY = startY;
		
		if(dir.equals("right")){
			endX = startX + pathLength;
			for (int i=startX; i<=endX; i++){
				tiles[startY][i] = true;
			}
		}
		else if (dir.equals("down")){
			endY = startY + pathLength;
			for (int i=startY; i<=endY; i++){
				tiles[i][startX] = true;
			}
		}
		else if(dir.equals("up")){
			endY = startY - pathLength;
			for (int i=startY; i>=endY; i--){
				tiles[i][startX] = true;
			}
		}
		else if(dir.equals("left")){
			endX = startX - pathLength;
			for (int i=startX; i>=endX; i--){
				tiles[startY][i] = true;
			}
		}
		else {
			//TODO deal with incorrect direction
		}
		
		//TODO check whether path is valid by checking endpoint
	}
	
	public boolean isActive(int x, int y){
		return tiles[x][y];
	}
	
	public void setStart(int x, int y){
		this.start_x = x;
		this.start_y = y;
	}
	
	public void setEnd(int x, int y){
		this.end_x = x;
		this.end_y = y;
	}
	public boolean isStart(int x, int y){
		if(this.start_x == y && this.start_y == x){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isEnd(int x, int y){

		if(this.end_x == y && this.end_y == x){
			return true;
		}
		else{
			return false;
		}
	}
}
