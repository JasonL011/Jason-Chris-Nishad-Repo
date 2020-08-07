import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Restaurant {
	
	private PImage image;
	private String name;
	private ArrayList<Food> menu = new ArrayList<Food>();
	
	public Restaurant(String name, PImage image, ArrayList<Food> menu) {
		this.name = name;
		this.image = image;
		this.menu = menu;
	}
	
	public String getName() {
		return name;
	}
	
	public PImage getImage() {
		return image;
	}
	
	public ArrayList<Food> getMenu() {
		return menu;
	}
	
	public void drawMenu(PApplet marker) {
		
		marker.fill(0);
		int x = 30; 
		int y = 30;
		for(Food e : menu) {
			
			marker.text(e.getName(), x, y);
			marker.text(e.getCalories() + "", x, y+30);
			e.draw(marker, x , y + 40);
			
			x += 100;
			
			if(x % 120 == 0) {
				
				
				y += 100;
			}
			
			
		}
	}
	
}
