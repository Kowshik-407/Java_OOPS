public class VariableScope {
    
    public static void main(String[] args) {
        int a = 2;
        // Using void
        System.out.println("Before Update " + a);
        update(a);
        System.out.println("After Update " + a);
        // Using int
        System.out.println("Before Update " + a);
        a = updateValue(a);
        System.out.println("After Update " + a);
    }
 
    static void update(int a) {
        a = 7;
    }
// Guess the Output : It will be 2 , 2 because there is no scope to have a = 7;
    static int updateValue(int a) {
        a = 7;
        return a;
    }
}
