import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;


public class CalorieHub extends PApplet {
	
	
	private Restaurant innout;
	private ArrayList<Food> cart = new ArrayList<Food>();
	private You you;
	
	
	public CalorieHub() {
		
		innout = new Restaurant("In n Out Burger", "in n out.jpeg", null);
		you = new You(cart);
		
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {
		
		innout.makeRes();
		
		
		
	}
	
	public void draw() {
		
		
		innout.drawMenu(this);
		for(Food e: you.getCart()) {
			
			System.out.println(e.getName());
			
		}
		
		if(mouseButton == LEFT) {
			
			you.timeout();
			
			if(you.getPick() == true) {
			for(int counter = 0; counter < 19; counter++ ) {
				
				if((mouseX -30) / 200 == counter ) {
					
					counter += (((mouseY  - 42) / 180 )* 6);
					
					
					you.addtoCart(innout.getMenu().get(counter));
					mouseX = 100000;
					mouseY = 10000;
					
					break;
					
				}
				
				
			}
		
			
		
		
		}
			else {
				
				you.drawCart(this);
			}
		}
		
		

	}
	

	

}
