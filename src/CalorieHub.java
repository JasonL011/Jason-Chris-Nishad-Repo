import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;
import processing.core.PImage;

public class CalorieHub extends PApplet {
	
	
	private Restaurant innout;

	private ArrayList<Food> innoutmenu = new ArrayList<Food>(Arrays.asList(new Food("download.jpg", "Double Double", 500)));
	
	public CalorieHub() {
		
		innout = new Restaurant( "in and out", null, innoutmenu);
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {
		
		
		
		
		
	}
	
	public void draw() {
		
		innout.drawMenu(this);
	
		
//		if(mouseButton == LEFT) {
//			System.out.println(mouseX);
//			
//			
//			
//			
//		}
		
		

	}
	

}
