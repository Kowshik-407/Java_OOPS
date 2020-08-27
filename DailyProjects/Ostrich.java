public class Ostrich extends Bird{
    
    public void FlyBehavior(){
        System.out.println("The ostrich Can Fly.");
    }

    // @Override
    public void eat(String item){
        System.out.println("The Ostrich will eat." + item);
    }
}