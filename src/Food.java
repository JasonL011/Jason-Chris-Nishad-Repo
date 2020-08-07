import processing.core.PApplet;
import processing.core.PImage;

public class Food {
	
	private String name;
	private int calories;
	private String filename;


	public Food(String filename, String name, int calories) {
		this.filename = filename;
		this.name = name;
		this.calories = calories;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public String getName(){
		return name;

	}
	
	public int getCalories() {
		return calories;
	}
	
	public void draw(PApplet marker, float x, float y) {
		
		PImage image = marker.loadImage(filename);
		marker.image(image, x, y, 40, 40);
	}
}
