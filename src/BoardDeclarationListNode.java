//package compiler;

import java.util.ArrayList;

public class BoardDeclarationListNode {
	
	ArrayList<String> sizeStartEndList;
	String pointsAndPaths;	
	
	public BoardDeclarationListNode(ArrayList<String> sizeStartEndList, String pointsAndPaths) {
		this.sizeStartEndList = sizeStartEndList;
		this.pointsAndPaths = pointsAndPaths;
	}

	public ArrayList<String> getSizeStartEndList() {
		return sizeStartEndList;
	}

	public void setSizeStartEndList(ArrayList<String> sizeStartEndList) {
		this.sizeStartEndList = sizeStartEndList;
	}
	
	public String getPointsAndPaths() {
		return pointsAndPaths;
	}

	public void setPointsAndPaths(String pointsAndPaths) {
		this.pointsAndPaths = pointsAndPaths;
	}
	
	
	
}
