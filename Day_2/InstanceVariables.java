public class InstanceVariables {
    
    // One copy of all the object
    static int a = 5;
    public static void main(String[] args) {
        System.out.println("Before Update " + a);
        updateValue(a);
        System.out.println("After Update " + a);
        System.out.println("Before Update " + a);
        Update(a);
        System.out.println("After Update " + a);
    }

    static void updateValue(int a) {
        a = a + 2;
    }
    // It will returns 5 , 5
    static void Update(int a) {
        InstanceVariables.a = a + 2;
    }
}