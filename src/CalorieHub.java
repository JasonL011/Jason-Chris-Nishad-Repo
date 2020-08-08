import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;


public class CalorieHub extends PApplet {
	
	
	private Restaurant innout;

	private ArrayList<Food> innoutmenu = new ArrayList<Food>
	(Arrays.asList(
			new Food("double.png", "Double Double", 500), 
			new Food("cheese.png", "Cheeseburger", 480), 
			new Food("ham.png", "Hamburger", 390), 
			new Food("fries.png", "French Fries", 370),
			new Food("coca cola.png", "Coca-Cola", 130), 
			new Food("diet coke.png", "Diet Coke", 0), 
			new Food("7.png", "7-Up", 130), 
			new Food("pepper.png", "Dr Pepper", 130), 
			new Food("pepper.png", "Root Beer", 150), 
			new Food("pink lemonade.png", "Pink Lemonade", 140), 
			new Food("maid light lemonade.png", "Lemonade", 5), 
			new Food("iced tea.png", "Iced Tea", 0), 
			new Food("iced tea.png", "Sweet Tea", 90), 
			new Food("milk.png", "Milk", 180), 
			new Food("coffee.png", "Coffee", 5), 
			new Food("cocoa.png", "Hot Cocoa", 130), 
			new Food("chocolate shake.png", "Chocolate Shake", 580), 
			new Food("strawberry shake.png", "Strawberry Shake", 590), 
			new Food("vanilla shake.png", "Vanilla Shake", 570)));

	
	
	public CalorieHub() {
		
		innout = new Restaurant("In n Out Burger", "in n out.jpeg", innoutmenu);
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
