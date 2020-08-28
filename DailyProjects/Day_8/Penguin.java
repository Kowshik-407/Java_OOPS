package Day_8;

public class Penguin extends Bird implements SwimBehavior {
	public void eat() {
		System.out.println("Penguin is eating");
	}
	public void swim() {
		System.out.println("Penguin can Swim");
	}
}