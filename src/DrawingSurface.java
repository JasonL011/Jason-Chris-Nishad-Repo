import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;
import processing.core.PImage;

public class DrawingSurface extends PApplet {
	
	
	private Restaurant ininout;

	private ArrayList<Food> ininoutmenu = new ArrayList<Food>(Arrays.asList(new Food("download.jpg","dog",500)));
	
	public DrawingSurface() {
		
		ininout = new Restaurant( "in and out", null, ininoutmenu);
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {
		
		
		
		
		
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
