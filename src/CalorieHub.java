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
		fill(211, 211, 211);
		noStroke();
		rect(300, 860, 600, 50);
		fill(255);
		textSize(40);
		text("Total Calories in Cart: " + 0, 300, 900);
		
	}
	
	public void draw() {
		
		innout.drawMenu(this);
		you.drawCart(this);
		
		
		
		if(mouseButton == LEFT) {
			
			you.timeout();
			
			if(you.getPick() == true) {
			for(int counter = 0; counter < 19; counter++ ) {
				
				if(((mouseX -30) / 200 == counter)  && mouseX < 1250) {
					
					counter += (((mouseY  - 42) / 180 )* 6);
					
					
					you.addtoCart(innout.getMenu().get(counter));
					System.out.println(counter);
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
		
		if(mouseButton == RIGHT) {
			
			you.timeout();
			
				for(int counter = 0; counter < you.getCart().size(); counter++ ) {
					
					if((mouseX - 1280) / 150 == counter && you.getPick() ==true) {
						
						counter += (((mouseY  - 42) / 120 )* 3);

						if(counter <= you.getCart().size())
							you.removeFromCart(you.getCart().get(counter));
						
						//counter = 0;
						System.out.println(counter + "    " +  you.getCart().size());
						fill(211,211,211);
						rect(1250, 0, 900, 10000);
						you.drawCart(this);
					
				}
				
			}
			
		
		}
		
		

	}
	

	

}
