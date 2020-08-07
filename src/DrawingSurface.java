import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;

public class DrawingSurface extends PApplet {
	
	
	private Restaurant ininout;
	private ArrayList<Food> ininoutmenu = new ArrayList<Food>(Arrays.asList(new Food(null,"dog",500), new Food(null,"cat",300)));
	public DrawingSurface() {
		
		ininout = new Restaurant( "in and out", null, ininoutmenu);
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {
		
		
		//pad.drawGrid(this);
		
		
	}
	
	public void draw() {
		
		ininout.drawMenu(this);
	
		
//		if(mouseButton == LEFT) {
//			System.out.println(mouseX);
//			
//			
//			
//			
//		}
		
		

	}
	

}
