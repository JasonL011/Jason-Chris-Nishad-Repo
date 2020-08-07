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
}
