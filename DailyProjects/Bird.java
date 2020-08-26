abstract class Bird {
    /** 
     * 
     * Create the Bird Abstract Class with 4 properties and 2 non-abstract methods and 2 abstract methods
     * Create three subclasses parrot, Ostrich, Penguin and implement abstract methods 
     * Create two interfaves FlyBehaviour, SwimBehaviour
     * Parrot class will extend Bird and implements FlyBehaviour
     * Penguin Class will extend Bird and implements FlyBehaviour
     * Penguin class will extend Bird and implements SwimBehaviour
     */

    public static void main(String[] args) {
        
        FlyBehavior birdobj = new FlyBehavior();
        birdobj.fly();

        SwimBehavior swimobj = new SwimBehavior();
        swimobj.swim();

        Ostrich ostrich = new Ostrich();
        ostrich.FlyBehavior();

        Parrot parrot = new Parrot();
        parrot.FlyBehavior();

        Penguin penguin = new Penguin();
        penguin.SwimBehavior();
        
    }
}