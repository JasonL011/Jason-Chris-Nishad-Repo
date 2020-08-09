import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;
import processing.core.PImage;


public class CalorieHub extends PApplet {
	
	
	private Restaurant innout;
	private ArrayList<Food> cart = new ArrayList<Food>();
	private Customer you;
	private boolean f = true;
	private boolean restaurantChosen = false;
	private PImage innoutpic;
	public CalorieHub() {
		
		innout = new Restaurant("In n Out Burger", "in n out.png", null);
		you = new Customer(cart);
		
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {
		//background(0);
		innout.makeRes();
		fill(211, 211, 211);
		noStroke();
		rect(300, 860, 600, 50);
		fill(255);
		textSize(40);
		text("Total Calories in Cart: " + 0, 300, 900);
		innoutpic = loadImage("in n out.png");
		
	}
	
	public void draw() {
		
		
		if(restaurantChosen) {
					innout.drawMenu(this);
					you.drawCart(this);
					rect(700, 960, 300, 50);
					rect(100, 960, 200, 50);
					fill(0);
					text("return item", 720, 990);
					
					if(mouseButton == LEFT) {
						
						you.timeout();
						
						if(you.getPick() == true) {
						for(int counter = 0; counter < innout.getMenu().size(); counter++ ) {
							
							if(((mouseX -30) / 200 == counter)  && mouseX < 1250 && mouseY < innout.getMenu().size()/4 * 180) {
								
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
						
						
						if(mouseX > 700 && mouseX < 1000 && mouseY < 1010 && mouseY > 960 && f == true) {
							
						
							if(you.getPick() == false  && you.getCart().size() > 0) {
								System.out.println(you.getCart().size());
								you.removeFromCart(you.getCart().size() - 1);
								fill(211, 211, 211);
								rect(1280, 0 , 1000,10000);
								
								you.drawCart(this);
								
								//f = false;
								mouseX = 100000;
								mouseY = 10000;
							}
							
							
						}
						
						if(mouseX > 100 && mouseX < 300 && mouseY < 1010 && mouseY > 960) {
							restaurantChosen = false;
							fill(211, 211, 211);
							rect(0,0,10000,10000);
							you.resetCart();
							mouseX = 100000;
							mouseY = 10000;
							
						}
						
					}
					
					
				}
		else {
			
			
			image(innoutpic, 30,30 , 300,300 );
			
			if(mouseButton == LEFT)	{
				
				if(mouseX < 330 && mouseX > 30 && mouseY < 330 && mouseY > 30) {
					
					restaurantChosen = true;
					fill(211, 211, 211);
					rect(0,0,10000,10000);
					mouseX = 100000000;
					mouseY = 1000000000;
				}
				
				
			}
			
		}
	}

	}
	

	


