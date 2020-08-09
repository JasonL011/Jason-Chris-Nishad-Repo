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
		else if(name.equals("Panda Express")) {
			
			//System.out.println("d");
			menu  = new ArrayList<Food>(Arrays.asList(
                    new Food("beijing beef.PNG", "Beijing Beef", 500), 
                    new Food("black pepper chick.PNG", "Black Pepper Chicken", 480), 
                    new Food("broco beef.PNG", "Broccoli Beef", 390), 
                    new Food("chicken egg roll.PNG", "Chicken Egg Roll", 370),
                    new Food("choco chunk cookie.PNG", "Chocolate Chunk Cookie", 130), 
                    new Food("chow mein.PNG", "Chow Mein", 0), 
                    new Food("cream cheese rangoon.PNG", "Cream Cheese Rangoon", 130), 
                    new Food("fourtune cookies.PNG", "Fortune Cookies", 130), 
                    new Food("fried rice.PNG", "Fried Rice", 150), 
                    new Food("grilled teriyaki chick.PNG", "Grilled Teriyaki Chicken", 140), 
                    new Food("kung pao chick.PNG", "Kung Pao Chicken", 5), 
                    new Food("mush chick.PNG", "Mushroom Chicken", 0), 
                    new Food("orange chick.PNG", "Orange Chicken", 90), 
                    new Food("shrimp.PNG", "Shrimp", 180), 
                    new Food("string bean chick breast.PNG", "String Bean Chicken Breast", 5), 
                    new Food("super greens.PNG", "Super Greens", 130), 
                    new Food("sweet fire chick breast.PNG", "Sweet Fire Chicken Breast", 580), 
                    new Food("vegetable spring roll.PNG", "Vegetable Spring Roll", 590), 
                    new Food("white steam rice.PNG", "White Steamed Rice", 570)));
			
			
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
		
		
		marker.textSize(15);
		marker.rect(1250, 0, 2, 10000);
		marker.textSize(20);
		marker.fill(255);
		marker.text("Menu", 30, 30);
		
		marker.fill(255);
		marker.rect(20, 40, 1200, 750);
		marker.fill(0);
		
		int x = 30; 
		int y = 80;
		for(Food e : menu) {
			
			marker.textSize(10);
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
