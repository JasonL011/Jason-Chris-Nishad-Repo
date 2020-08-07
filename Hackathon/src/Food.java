import processing.core.PApplet;
import processing.core.PImage;

public class Food {
	
	private String name;
	private int calories;
	private PImage image;

	public Food(PImage image, String name, int calories) {
		this.image = image;
		this.name = name;
		this.calories = calories;
	}
	
	public PImage getImage() {
		return image;
	}
	
	public String getName(){
		return name;

	}
	
	public int getCalories() {
		return calories;
	}
}
