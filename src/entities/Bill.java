package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	
	public double cover() {
		if(feeding() < 30.00)
			return 4.0;
		return 0.0;
	}

	public double feeding() {
		double feeding = beer * 5.0;
		feeding += softDrink * 3.0;
		feeding += barbecue * 7.0;
		return feeding;
	}

	public double ticket() {
		return this.gender == 'M' ? 10.0 : 8.0;
	}
	
	public double total() {		
		return this.cover() + this.feeding() + this.ticket();	
	}
	
}
