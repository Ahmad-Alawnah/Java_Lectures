import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 4/3//2020
        // abstract classes and interfaces

        Payable x = new Employee(); //similar to polymorphism (we view an employee from a Payable perspective)

        Student[] students = new Student[100];

        for(int i =0;i<students.length;i++){
            students[i] = new Student("Khalil",50,1);
        }

        Arrays.sort(students); //will not sort (compilation error) "exception", because we did not define how to sort students
        //we must implement the comparable interface
        //sort will look for comparable, so, any object that wants to use it, it must implement comparable

        //interfaces should be well documented (very important)
        for(Student s: students){
            System.out.println(s); //must be overridden in student
        }
    }
}
