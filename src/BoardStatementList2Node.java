//package compiler;

import java.awt.Point;
import java.util.ArrayList;

//import codeGeneration.fred.Path;

public class BoardStatementList2Node {

	private ArrayList<Path> paths;
	private ArrayList<Point> points;
	
	public BoardStatementList2Node(ArrayList<Path> paths, ArrayList<Point> points){
		this.paths = paths;
		this.points = points;
	}
	
	public ArrayList<Path> getPaths() {
		return paths;
	}

	public void setPaths(ArrayList<Path> paths) {
		this.paths = paths;
	}

	public ArrayList<Point> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}

}
