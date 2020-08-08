import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;

public class Restaurant {
	
	private String fileName;
	private String name;
	private ArrayList<Food> menu = new ArrayList<Food>();
	
	
	public Restaurant(String name, String fileName, ArrayList<Food> menu) {
		this.name = name;
		this.fileName = fileName;
		this.menu = menu;
	}
	
	public void makeRes() {
		
		if(name.equals("In n Out Burger")) {	
			menu  = new ArrayList<Food>(Arrays.asList(
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
		}
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public ArrayList<Food> getMenu() {
		return menu;
	}
	
	public void drawMenu(PApplet marker) {
		
		marker.fill(0);
		marker.textSize(15);
		marker.rect(1250, 0, 2, 10000);
		marker.textSize(30);
		marker.text("Menu", 30, 30);
		
		int x = 30; 
		int y = 80;
		for(Food e : menu) {
			
			marker.textSize(15);
			marker.text(e.getName() + " - " + e.getCalories(), x, y);
			e.draw(marker, x , y + 12);
			
			x += 200;
			
			if (x > 1200) {
				x = 30;
				y += 180;
			}
			
			
			
		}
		
		
	}
	
}
