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

     /**
      * 
      * Extend the assignment 7 and add a new method in the Bird class with a name eat()
      * override the method eat() in the classes Ostrich, Parrot, Penguin 
      * Add the overloaded of method of eat in the classes Ostrich, Parrot, Penguin
      * Overloaded will look like public void eat(String item) {    }
      */

      /**
       * 
       * Create a class constructBirds and create the objects of classes Ostrich, Parrot, Penguin with 
       * reference variables as Bird. 
       * 
       * Eg. Bird birdObj1 = new Ostrich()
       * Call both the eat methods on the object
       * birdObj1.eat();
       * birdObj1.eat("insect");
       * 
       * @param args
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
        
        EatBehavior eatobj = new EatBehavior();
        eatobj.eat();
    }
}