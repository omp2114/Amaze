//package compiler;


public class PathNode {

	String string;
	String id;
	String point_id;
	String generation;
	
	public PathNode(String name, String id, String point_id){
		this.string = name;
		this.id = id;
		this.point_id = point_id;
		
	}

	public String getName() {
		return string;
	}

	public void setName(String name) {
		this.string = name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPoint_ID()
	{
		return point_id;
	}
	
	public String getPathDrawBoard(String board){
		generation = board + "." + "addPath(" + id + ");";
		return generation;
		
		
	}
	public String getPathDrawStructure(String structure){
		generation = structure + "." + "setPath(" + id + ");";
		return generation;
		
		
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
