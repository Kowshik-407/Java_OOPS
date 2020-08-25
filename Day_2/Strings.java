public class Strings {
    
    public static void main(String[] args) {

        // int a = 5                            --> It is a primitive Data type. It wiil store in stack
        // string is class in Java
        // string is not primitive data types
        // String s --> Reference to string object
        String s1 = "Hello!! ";                 // s1 stores in stack. But the value of s1 'Hello!! ' will be stored in Heap.       
        System.out.println(s1);                 // --> the value of s1 stores in heap because it is the class.
        String s2 = "Kowshik407";    
        System.out.println(s2);
        // strings are immutable in JAVA
        String s3 = s1 + s2;
        System.out.println(s3);
        s1 = s1 + "Kowshik407"; 
        System.out.println(s1);                 // This will be stored in heap
    }
}

/** 
 * Note ::> 
 *          All the primitive data types are stored in Stacck
 *          All the reference data types are stored in Heap
 */