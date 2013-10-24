//package compiler;
//import codeGeneration.fred.Path;
import java.awt.Point;


public class StructureNode {
	
	private Point p;
	private Path q;
	
	public StructureNode (Point p , Path q) {
		this.p = p;
		this.q = q;
	}
	
	public Point getPoint()
	{
		return p;
	}
	
	public Path getPath()
	{
		return q;
	}
	

}
