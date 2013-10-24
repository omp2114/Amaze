//package compiler;

import java.awt.Point;
import java.util.ArrayList;

//import codeGeneration.fred.Path;

public class BoardStatementListNode {

	private ArrayList<Point> sizeStartEndList;
	private ArrayList<Point> points;
	private ArrayList<Path> paths;
	
	public BoardStatementListNode(ArrayList<Point> sizeStartEndList, ArrayList<Point> points, ArrayList<Path> paths){
		this.sizeStartEndList = sizeStartEndList;
		this.points = points;
		this.paths = paths;
	}
	
	public ArrayList<Point> getSizeStartEndList() {
		return sizeStartEndList;
	}

	public void setSizeStartEndList(ArrayList<Point> sizeStartEndList) {
		this.sizeStartEndList = sizeStartEndList;
	}

	public ArrayList<Point> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}

	public ArrayList<Path> getPaths() {
		return paths;
	}

	public void setPaths(ArrayList<Path> paths) {
		this.paths = paths;
	}
	
}
