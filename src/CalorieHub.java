import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;
import processing.core.PImage;


public class CalorieHub extends PApplet {
	
	
	private Restaurant innout;
	private Restaurant pandaExpress;
	private ArrayList<Food> cart = new ArrayList<Food>();
	private Customer you;
	private boolean f = true;
	private boolean restaurantChosen = false;
	private PImage innoutpic;
	private PImage pandapic;
	private String reschose = "";
	public CalorieHub() {
		
		innout = new Restaurant("In n Out Burger", "in n out.png", null);
		pandaExpress = new Restaurant("Panda Express", "panda.png", null);
		you = new Customer(cart);
		
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {
		background(220, 20, 60);
		
		
	
		noStroke();
		rect(300, 860, 600, 50);
		
		textSize(30);
		text("Total Calories in Cart: " + 0, 300, 900);
		innoutpic = loadImage("in n out.png");
		pandapic = loadImage("panda.png");
		
	}
	
	public void draw() {
		
		if(restaurantChosen == true) {
			if(reschose.equals("In n Out Burger")) {
				
				innout.makeRes();
				
			}
			else if(reschose.equals("Panda Express")) {
				
				pandaExpress.makeRes();
			}
		}
		
		if(restaurantChosen) {
			
				int size = 0;
				ArrayList<Food> menu = new ArrayList<Food>();
				
					if(reschose.equals("In n Out Burger")) {
						
						innout.drawMenu(this);
						size = innout.getMenu().size();
						for(Food e: innout.getMenu()) {
							
							menu.add(e);
						}
					}
					else if(reschose.equals("Panda Express")) {
						
						pandaExpress.drawMenu(this);
						size = pandaExpress.getMenu().size();
						
						for(Food e: pandaExpress.getMenu()) {
							
							menu.add(e);
						}
					}
					
					you.drawCart(this);
					//fill(211, 211, 0);
					fill(255);
	                text("Return to Main", 30, 980);
	               // text("Delete Item", 1280, 980);
					fill(255);
					text("Delete Item", 1280, 980);
					
					if(mouseButton == LEFT) {
						
						you.timeout();
						
						if(you.getPick() == true) {
							
							
						
						for(int counter = 0; counter < size; counter++ ) {
							
							if(((mouseX -30) / 200 == counter)  && mouseX < 1250 && mouseY < size/4 * 180) {
								
								counter += (((mouseY  - 42) / 180 )* 6);
								
								you.drawCart(this);
								you.addtoCart(menu.get(counter));
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
						
						
						if(mouseX > 1280 && mouseX < 1430 && mouseY > 950 && mouseY < 980 && f == true) {
							System.out.println("fdhjksflkhjasfdhkj");
						
							if( you.getCart().size() > 0) {
								System.out.println(you.getCart().size());
								you.removeFromCart(you.getCart().size() - 1);
								fill(220, 20, 60);
								rect(1280, 0 , 1000,10000);
								
								you.drawCart(this);
								
								//f = false;
								mouseX = 100000;
								mouseY = 10000;
							}
							
							
						}
						
						 if(mouseX > 30 && mouseX < 190 && mouseY > 950 && mouseY < 980) {
							
							restaurantChosen = false;
							fill(211, 211, 211);
							
							//rect(30, 900, 300, 50);
                            rect(0,0, 10000,10000);
							you.resetCart();
							background(220, 20, 60);
							mouseX = 100000;
							mouseY = 10000;
							
						}
						
					}
					
					
				}
		else {
			
			fill(220, 20, 60);
			stroke(0);
			strokeWeight(2);
			rect(30, 5, 160, 30);
			noStroke();
			fill(255);
	        text("Calorie Hub", 30, 30);
	        text("Select a restaurant", 30, 65);
			image(innoutpic, 30, 80, 300, 200 );
			image(pandapic, 30, 350 , 300, 300);
			
			if(mouseButton == LEFT)	{
				
				if(mouseX < 330 && mouseX > 30 && mouseY < 280 && mouseY > 80) {
					
					reschose = "In n Out Burger";
					
					restaurantChosen = true;
					fill(220, 20, 60);
					rect(0,0,10000,10000);
					mouseX = 100000000;
					mouseY = 1000000000;
				}
				
				if(mouseX < 330 && mouseX > 30 && mouseY < 650 && mouseY > 350) {
					
					reschose = "Panda Express";
					
					restaurantChosen = true;
					fill(220, 20, 60);
					rect(0,0,10000,10000);
					mouseX = 100000000;
					mouseY = 1000000000;
				}
				
				
			}
			
		}
	}

	}
	

	


