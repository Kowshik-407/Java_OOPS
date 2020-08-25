public class Operators {
    
    public static void main(String[] args) {
        
        int a = 1;
        System.out.println("Value of a postfix increment"); // It will return and then it will update
        System.out.println(a++);
        System.out.println("Value of a prefix increment"); // It will update and then return
        System.out.println(++a);
        System.out.println("Value of a postfix decrement"); // It will return and then it will update
        System.out.println(a--);
        System.out.println("Value of a prefix decrement"); // It will update and then return
        System.out.println(--a);

        // Relational Operators

        // int x , y = 7 , 15;   --> It is an error to give like this
        int x = 7;
        int y = 15;
        boolean result1  = x > y;
        boolean result2  = x >= y;
        boolean result3  = x < y;
        boolean result4  = x <= y;
        boolean result5  = x == y;
        boolean result6  = x != y;

        // System.out.println(result1 + result2 +  result3 + result4 + result5 + result6); It is an error
        System.out.println("Result1 : " + result1);
        System.out.println("Result2 : " + result2);
        System.out.println("Result3 : " + result3);
        System.out.println("Result4 : " + result4);
        System.out.println("Result5 : " + result5);
        System.out.println("Result6 : " + result6);

        int flag1 = x > y ? 0 : 1;
        System.out.println("Flag first Case " + flag1);
        int flag2 = x >= y ? 0 : 1;
        System.out.println("Flag second Case " + flag2);
        int flag3 = x < y ? 0 : 1;
        System.out.println("Flag Third Case " + flag3);
        int flag4 = x <= y ? 0 : 1;
        System.out.println("Flag Fourth Case " + flag4);
        int flag5 = x == y ? 0 : 1;
        System.out.println("Flag Fifth Case " + flag5);
        int flag6 = x != y ? 0 : 1;
        System.out.println("Flag Sixth Case " + flag6);
    }
}