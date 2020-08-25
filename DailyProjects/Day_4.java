import java.util.Scanner;

public class Day_4 {
    /**
     * 
     * Count Odd and Even Digits
     * 
     * Write a program which takes one number as input and print the number of odd and even digits in the numbers.
     * 
     * Number can be a positive or negative both
     * 
     * You can assume that user will always enter number as input. 
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number : ");
        int a = sc.nextInt();
        int r, even = 0, odd = 0;
        while(a > 0 || a < 0){
            if(a == 0) break;
            r = a % 10;
            if(r == 0 || r % 2 == 0) {
                even++;
            }
            else{
                odd++;
            }
            a = a / 10;
        }
        System.out.println("Odd digit  : " + odd);
        System.out.println("Even digit : " + even);
        sc.close();
    }
}