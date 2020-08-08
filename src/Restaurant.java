import java.util.ArrayList;

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
		marker.rect(1250, 0, 1, 10000);
		int x = 30; 
		int y = 30;
		for(Food e : menu) {
			
			
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
