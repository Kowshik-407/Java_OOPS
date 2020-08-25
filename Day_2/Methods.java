public class Methods {
    
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int result = sum(a,b);                                                  // --> By having this we can have an error. Because 
        System.out.println("The sum of two variables " + result);                //     we need to assign the function as static
        int result1 = sum(7,15);
        System.out.println("The result : "  + result1);
        
    }

    // We call functions in python. But in JAVA we call as methods

    // return the method name arguments
    // void returns nothing
    // int returns value of int 
    static int sum(int num1, int num2) {
        int calsum = num1 + num2;
        return calsum;
    }
}