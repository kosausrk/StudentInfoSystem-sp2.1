
//sp2.1 Project: Student Information System
//Description: Create a Student class with attributes like name, age, and grades. Include methods to display student information and calculate their average grade. Create instances of the class and print the results to the console.


public class StudentInfoSystem {
    private String name;
    private int age;
    private int[] grades;

    public StudentInfoSystem(String name, int age, int[] grades){
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public int getAvg() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    public void displayInfo(){
        System.out.println("Student Info \n Name: " + this.name + "\n Age: " + this.age + "\n GPA: " + this.getAvg());
    }
}