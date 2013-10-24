//package codeGeneration.fred;

import java.util.ArrayList;

public class Structure {
	private ArrayList<Path> paths = new ArrayList<Path>();
//	private String ID;
	
	public Structure(){
		
	}

	public void setPath(Path path){
		paths.add(path);
	}

	public ArrayList<Path> getPaths(){
		return paths;
	}
	
	
	
}