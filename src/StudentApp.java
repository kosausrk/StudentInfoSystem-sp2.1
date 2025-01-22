
public class StudentApp {
    public static void main(String[] args){
        System.out.println("Hello World");
        int[] grades = {100,93,65};
        StudentInfoSystem student = new StudentInfoSystem("John Doe", 34, grades);
        student.displayInfo();
    }
}
