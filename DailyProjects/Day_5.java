import java.util.Scanner;

public class Day_5 {
    /** 
     * Write a program which takes number as input and print the half damond pattern split done vertically
     * 
     * Refer I/O for sample cases
     * 
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1 : ");
        int n = sc.nextInt();
        int i,j;
        //  Loop for the upper half
        for(i = 0; i < n; i++){
            for(j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //  Loop for the lower half
        for(i = 1; i < n; i++){
            for(j = i; j < n; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
         sc.close();
     }
}