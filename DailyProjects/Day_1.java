import java.util.*;

/** Calculate the Restaurant Bills

Write a program to consider th price of the 3 products for the restaurant bill and the tax percentage and calculate the final amount.

Assume the price of all the 3 products and the tax percentage will also be positive.

Handle the decimal values

Tax amount  = (tax percentage / 100) * Product price*/

public class Day_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // System.in a standard input stream
        // Note have a difference betweeen print and println where; println will perform print and moves to next line.
        System.out.print("Price 1 : ");
        float a = sc.nextFloat();
        System.out.print("Price 2 : ");
        float b = sc.nextFloat();
        System.out.print("Price 3 : ");
        float c = sc.nextFloat();
        System.out.print("tax % : ");
        float taxPerc = sc.nextInt();
        float productPrice = a + b + c;
        float tax = productPrice + (taxPerc/100) * (productPrice);
        System.out.println("Final Amount :" + tax);
    
        float result = taxAmount(a, b, c, tax);
        System.out.println("Final Amount : " + result);
        sc.close();
    }

    static float taxAmount(float n1, float n2, float n3, float n4) {
        float finalpr = n1 + n2 + n3;
        float finalSum = (n4 /100) * finalpr;
        return finalSum;
    }
}