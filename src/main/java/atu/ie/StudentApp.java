package atu.ie;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;
public class StudentApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student myStudent = new Student();

        System.out.println("Please enter a name: ");
        String studentName = scanner.nextLine(myStudent.getStudentName());

        System.out.println("Please enter your Student ID: ");
        int studentID = scanner.nextInt(myStudent.getStudentID());

        System.out.println("Please enter age: ");
        int studentAge = scanner.nextInt(myStudent.getStudentAge());

        System.out.println("Please enter Address: ");
        String studentAddress = scanner.nextLine();

        System.out.println(scanner.toString());
        try {
            System.out.println("Please enter a filename");
            String fileName = scanner.nextLine();
            Scanner File = new Scanner(new File(fileName));
            PrintWriter prw = new PrintWriter(fileName);
            prw.println(studentName);
            prw.println(studentID);
            prw.println(studentAge);
            prw.println(studentAddress);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}