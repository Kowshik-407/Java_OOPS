package Day_8;

public class Parrot extends Bird implements FlyBehavior {
	public void eat() {
		System.out.println("Parrot is eating");
	}
	public void fly() {
		System.out.println("Parrot can fly");
	}

}
