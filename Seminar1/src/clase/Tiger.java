package clase;

public class Tiger extends Animal{
	private String food;
	public Tiger(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}
	public Tiger(String nume, String food) {
		super(nume);
		this.food = food;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	
}
