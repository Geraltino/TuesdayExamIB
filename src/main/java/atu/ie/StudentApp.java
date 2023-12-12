package atu.ie;
import java.io.File;
import java.io.IOException;

import java.util.Scanner;
import java.io.FileWriter;
public class StudentApp {
    public static void main(String[] args) {
        Student myStudent = new Student();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your Student ID: ");
        String studentID = scanner.nextLine();

        System.out.println("Please enter age: ");
        String studentAge = scanner.nextLine();

        System.out.println("Please enter Address: ");
        String studentAddress = scanner.nextLine();

        System.out.println(scanner.toString());
        try {
            System.out.println("Please enter a filename");
            String fileName = scanner.nextLine();
            File myfile = new File(fileName);
            FileWriter fw = new FileWriter(myfile,true);
            fw.write(studentAddress);
            fw.close();

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}