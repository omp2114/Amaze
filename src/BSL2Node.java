//package compiler;

import java.util.ArrayList;

//import codeGeneration.fred.Path;

public class BSL2Node {

	String string;
	ArrayList<String> pathIDs; 
	
	public BSL2Node(String string, ArrayList<String> pathIDs){
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
