import java.util.ArrayList;

import processing.core.PApplet;

public class Customer {

	private ArrayList<Food> cart = new ArrayList<Food>();
	private boolean canPick = true;
	private boolean overload = false;
	private final int AVGCALORIECOUNT = 2400;
	public Customer(ArrayList<Food> cart) {
		
		this.cart = cart;
	}
	
	public  ArrayList<Food> getCart(){
		
		return cart;
	}
	
	public void addtoCart(Food food) {
		
		if(overload == false) 
			cart.add(food);
	}
	
	public void removeFromCart(int i) {
		
		cart.remove(i);
	}
	
	
	public boolean getPick() {
		
		return canPick;
	}
	
	public void timeout() {
//		if(overload == false) {
//			if(canPick == true) {
//				
//				canPick = false;
//			}else {
//				
//				canPick = true;
//			}
//		}
	}
	
	public void resetCart() {
		
		overload = false;
		cart.clear();
		
	}
	
	
	
	public void drawCart(PApplet marker) {
		
		marker.fill(255);
		marker.textSize(10);
		int x = 1280; 
		int y = 80;
		if(overload == false) {
			for(Food e : cart) {
				
				marker.textSize(15);
				marker.text(e.getName() + " - " + e.getCalories(), x, y);
				e.draw(marker, x , y + 12);
				
				x += 200;
				
				if (x >= 1850) {
					x = 1280;
					y += 150;
				}
				
				
				
			}
		}
		
		
		//100, 1000
		
				int sum = 0;
				
				for(Food e: cart) {
					if(sum <= AVGCALORIECOUNT) {
						overload = false;
						sum += e.getCalories();
						
					}
					else {
						overload = true;
					}
						
				}
				if (overload == true) {
					marker.fill(0,255,255);
					marker.textSize(30);
					marker.text("That is over the recommended daily average intake of calories!", 30, 930);
				}
				else {
					marker.fill(220, 20, 60);
					marker.rect(20,870, 1230,100);
					
				}
				
				marker.fill(220, 20, 60);
				marker.noStroke();
				marker.rect(300, 860, 600, 50);
				marker.fill(255);
				marker.textSize(30);
				marker.text("Total Calories in Cart: " + sum, 30, 900);
				
				marker.textSize(30);
				marker.text("Your List", 1280, 30);
	}
}
	
	
	

