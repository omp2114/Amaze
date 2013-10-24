//package compiler;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
//import java.util.ArrayList;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeNodeStream;

//import compiler.AmazeParser.maze_return;

public class Test {
	
	/**+ '\n' + "}";  
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		FileInputStream fileInput = new FileInputStream(args[0]);
		
		String[] check = args[0].split("\\.");
		if(check[check.length-1].equals("amz")){
		
		DataInputStream dataInput = new DataInputStream(fileInput);
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(dataInput));
		String line;
		String inLine="";
		while((line = buffReader.readLine())!= null){
			inLine = inLine + line;
		}
		dataInput.close();
		
		CharStream charStream = new ANTLRStringStream(inLine);

		AmazeLexer lexer = new AmazeLexer(charStream);

		TokenStream tokenStream = new CommonTokenStream(lexer);
		AmazeParser parser = new AmazeParser(tokenStream);
		
		AmazeParser.maze_return maze = parser.maze();
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(maze.tree);
		EvaluatorWalker walker = new EvaluatorWalker(nodeStream);
		String temp = walker.maze();
		
        try{
		        FileWriter fstream = new FileWriter("Out.java");
		        BufferedWriter out = new BufferedWriter(fstream);
		        out.write(temp);
		        out.close();
        }
		      catch (Exception e){//Catch exception if any
		        System.out.println("Error: " + e.getMessage());
		      }
		}
		else{
			System.out.println("Not a .amz file!");
		}
	}
	
}

