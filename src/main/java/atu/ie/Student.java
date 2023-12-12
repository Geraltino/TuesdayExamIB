package atu.ie;

public class Student {
    private String studentName;
    private int studentID;
    private int studentAge;
    private String studentAddress;

    public Student(String studentName, int studentID, String studentAddress, int studentAge){
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentID = studentID;

    }
    public Student(){
        this.studentName = "";
        this.studentAge = 0;
        this.studentID = 0;
        this.studentAddress = "";
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                ", studentAge=" + studentAge +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}


