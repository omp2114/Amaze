//package codeGeneration.fred;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board {
	private int size_x;
	private int size_y;
	private Matrix matrix;
	private	JFrame frame = new JFrame("Maze Game");
	private JPanel panel;
	
	public  Board(int size_x, int size_y){
		this.size_x = size_x;
		this.size_y = size_y;
		this.panel = new JPanel(new GridLayout(size_x, size_y));
		//removes run time error after changing dimension
		System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
		Dimension boardDim = new Dimension(600, 600); 
		panel.setPreferredSize(boardDim);
		
		this.matrix = new Matrix(size_x, size_y);
		
	}
	
	public  Board(Point xy){
		this.size_x = (int) xy.getX();
		this.size_y = (int) xy.getY();
		this.panel = new JPanel(new GridLayout(size_x, size_y));
		//removes run time error after changing dimension
		System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
		Dimension boardDim = new Dimension(600, 600); 
		panel.setPreferredSize(boardDim);
		
		this.matrix = new Matrix(size_x, size_y);
		
	}
	
	public void addStart(int start_x, int start_y){
		matrix.setStart(start_x,start_y);
	}
	
	public void addStart(Point xy){
		matrix.setStart((int) xy.getX(), (int) xy.getY());
	}
	
	public void addEnd(int end_x, int end_y){
		matrix.setEnd(end_x,end_y);
	}
	
	public void addEnd(Point xy){
		matrix.setEnd((int) xy.getX(), (int) xy.getY());
	}
	
	public void addPath(Path path){
		matrix.insertPath(path.point, path.direction, path.length);
	}
	
	public void addStructure(Structure structure){
		ArrayList<Path> path = structure.getPaths();
		for(int i = 0; i < path.size(); i++){
			addPath(path.get(i));
		}
	}
	
	public void drawBoard(){
		ImageIcon tileIcon = new ImageIcon("tile.jpg");
		JLabel temp;
		
		ImageIcon blankIcon = new ImageIcon("blank.png");
		JLabel temp2;
		
		ImageIcon specIcon = new ImageIcon("pacman_tile.png");
		JLabel temp3;
		//draw tiles based on matrix
		int k = 0;
		for (int i=0; i<size_x; i++){
			for (int j=0; j<size_y; j++){
				if(matrix.isStart(i, j) || matrix.isEnd(i,j)){
					temp3 = new JLabel(specIcon);
					panel.add(temp3,k++);
				}
				else if (matrix.isActive(i, j)){
					temp = new JLabel(tileIcon);
					panel.add(temp, k++);
				}
				else{ //point is blank
					temp2 = new JLabel(blankIcon);
					panel.add(temp2, k++);
				}

			}
		}
		
		frame.add(panel);
        
        //code to finish up frame
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);	
	}	
}
