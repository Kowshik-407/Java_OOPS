package Day_8;

public abstract class Bird {

	public void eat() {
		System.out.println("Eating...");
	}
	public void fly() {
		System.out.println("Flying...");
	}
	public String eat(String item) {
		return item;
	}
}