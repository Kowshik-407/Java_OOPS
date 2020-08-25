public class Day_2 {
    
    /**   Height and Weight Converter
     * 
     *  Write a program and create two static methods
     *  float heightConvertor(int heightFeetPart, int heightInchPart)
     *  float weightConvertor(int weight)
     * 
     *  You can call the these method in main method with given inputs
     * 
     *  At few places, heights are considered in feet and inches and weight in kg, we need to solve this problem and get the 
     *  height in cm and weight in pounds.
     * 
     *  Define the feet and inch part of the height and weight in the kg. Handle the decimal values for results, 
     *  input will always be integer.
     * 
     *  HINT ::> One foot is 12 inch and 1 inch is 2.54cm. One kg is 2.2 pounds.
     */

   public static void main(String[] args) {
      // TEST-CASE 1
      float h1 = heightConvertor(5, 11);
      System.out.println("Height in cm " + h1);
      float w1 = weightConvertor(60);
      System.out.println("Weight in pounds " + w1);
      // TEST-CASE 2
      float h2 = heightConvertor(5, 0);
      System.out.println("Height in cm " + h2);
      float w2 = weightConvertor(101);
      System.out.println("Weight in pounds " + w2);
   }

   static float heightConvertor(int heightFeetPart, int heightInchPart) {
      heightInchPart += heightFeetPart * 12;
      float cms = (float)(heightInchPart * 2.54);
      return cms;
   }

   static float weightConvertor(int weight) {
      float pounds = (float)(weight * 2.2);
      return pounds;
   }
}