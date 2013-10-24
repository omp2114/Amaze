//package compiler;

import java.util.ArrayList;

public class StatementListNode {

	String string;
	ArrayList<String> pathIDs; 
	
	public StatementListNode(String string, ArrayList<String> pathIDs){
		this.string = string;
		this.pathIDs = pathIDs;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<String> getPathIDs() {
		return pathIDs;
	}

	public void setPathIDs(ArrayList<String> pathIDs) {
		this.pathIDs = pathIDs;
	}
}
