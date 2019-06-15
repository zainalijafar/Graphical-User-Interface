public class PersonalCalculator implements Calculator {

	private int clicks; 
	
	public PersonalCalculator() {
		this.clicks = 0;
	}
	
	public void increase() {
		
		this.clicks++;
	}
	
	public int giveValue() {
		
		return this.clicks;
	}
}
