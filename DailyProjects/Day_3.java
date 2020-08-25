import java.util.Scanner;

public class Day_3 {
    /**
     * Due to the printing mistakes, few characters in words are exchanged and we need to fix with the help of program
     * Write a program which takes two string as input and exchage the first two character of one string with last two character 
     * of the other string. Same thing needs to be done for both the string.
     * Use of loop is not allowed
     * You can assume the length of both the input string will bw at least 4
     * Output strings should be stored in variable before printing.
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("String 1 : ");
        String a = sc.nextLine();
        String a1 = a.substring(0,2);
        String a2 = a.substring(a.length()-2);
        // System.out.println(a1);
        // System.out.println(a2);
        System.out.print("String 2 : ");
        String b = sc.nextLine();
        String b1 = b.substring(0,2);
        String b2 = b.substring(b.length() - 2);
        // System.out.println(b1);
        // System.out.println(b2);

        // a = a.replaceFirst(".{2}$", b2);
        // a = a.replaceFirst("{2}.", b1);
        // System.out.println(a);

        a = a.replace(a1, b2);
        a = a.replace(a2, b1);
        System.out.println("String 1 : " + a);
        
        b = b.replace(b1, a2);
        b = b.replace(b2, a1);
        System.out.println("String 2 : " + b);

        sc.close();
    }
}