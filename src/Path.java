//package codeGeneration.fred;

import java.awt.Point;

public class Path {
	public Point point;
	public String direction;
	public int length;
	
	public Path(Point point, String direction, int length){
		this.point = point;
		this.direction = direction;
		this.length  = length;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
