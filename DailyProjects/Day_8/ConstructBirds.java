package Day_8;

public class ConstructBirds {
	public static void main(String[] args) {
		Bird birdobj1 = new Ostrich();
		birdobj1.eat();
		birdobj1.eat("insects");
		Bird birdobj2 = new Penguin();
		birdobj2.eat();
		birdobj2.eat("insects");
		Bird birdobj3 = new Parrot();
		birdobj3.eat();
		birdobj3.eat("insects");
	}
}