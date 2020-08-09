import java.util.ArrayList;

import processing.core.PApplet;

public class You {

	private ArrayList<Food> cart = new ArrayList<Food>();
	private boolean canPick = true;
	private boolean overload = false;
	private final int AVGCALORIECOUNT = 2400;
	public You(ArrayList<Food> cart) {
		
		this.cart = cart;
	}
	
	public  ArrayList<Food> getCart(){
		
		return cart;
	}
	
	public void addtoCart(Food food) {
		
		cart.add(food);
	}
	
	public void removeFromCart(int i) {
		
		cart.remove(i);
	}
	
	
	public boolean getPick() {
		
		return canPick;
	}
	
	public void timeout() {
		if(overload == false) {
			if(canPick == true) {
				
				canPick = false;
			}else {
				
				canPick = true;
			}
		}
	}
		
	
	
	
	public void drawCart(PApplet marker) {
		
		marker.fill(0);
		marker.textSize(10);
		marker.rect(1250, 0, 1, 1000);
		int x = 1280; 
		int y = 30;
		if(overload == false) {
			for(Food e : cart) {
				
				
				marker.text(e.getName() + " - " + e.getCalories(), x, y);
				e.draw(marker, x , y + 12);
				
				x += 150;
				
				if (x >= 1850) {
					x = 1280;
					y += 150;
				}
				
				
				
			}
		}
		
		
		//100, 1000
		
				int sum = 0;
				
				for(Food e: cart) {
					if(sum < AVGCALORIECOUNT) {
						sum += e.getCalories();
						overload = false;
					}
					else {
						overload = true;
					}
						
				}
				if (overload == true) {
					marker.textSize(30);
					marker.text("That is over the recommended daily average intake of calories!", 300, 950);
				}
				marker.fill(211, 211, 211);
				marker.noStroke();
				marker.rect(300, 860, 600, 50);
				marker.fill(255);
				marker.textSize(40);
				marker.text("Total Calories in Cart: " + sum, 300, 900);
	}
}
	
	
	

