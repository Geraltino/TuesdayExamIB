package atu.ie;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner myStudent = new Scanner(System.in);


    System.out.println("Please enter a name: ");
    String name = myStudent.nextLine();

    System.out.println("Please enter your Student ID: ");
    int ID = myStudent.nextInt();

    System.out.println("Please enter age: ");
    int age = myStudent.nextInt();

    System.out.println("Please enter Address: ");
    String address = myStudent.nextLine();

    }
}