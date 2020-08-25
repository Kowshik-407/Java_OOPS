    /**
     * 
     * Create a class of switch and add 5 properties of there behaviour of switch
     * Create 5 object of switch
     * create a class of swithc with constructor taking properties as input
     */


public class Switch {
    String name;
    int marks;
    int rollno;
    char grade;
    int age;

    Switch() {
        name  = "Kowshik Kumar Aitha";
        marks = 75;
        rollno = 407;
        grade = 'A';
        age = 18;

    }
     public static void main(String[] args) {
        Switch obj = new Switch();
        obj.failure();
        obj.success();
        obj.gradeA();
        obj.gradeB();
        obj.gradeC();
     }

     public void failure() {
         System.out.println("He will fail when he got less than 35 marks");
     }
     public void success() {
         System.out.println("He will pass when he got greater than 35 marks");
     }
     public void gradeA() {
         System.out.println("He will have an excellent grade 'A'");
     }
     public void gradeB() {
        System.out.println("He will have an excellent grade 'B'");
    }
    public void gradeC() {
        System.out.println("He will have an excellent grade 'C'");
    }
}