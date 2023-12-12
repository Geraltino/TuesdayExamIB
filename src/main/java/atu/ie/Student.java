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

    }
public String getStudentName(){
        return studentName;
}
public String getStudentAddress(){
        return studentAddress;
}
public int getStudentID(){
        return studentID;
}
public int getStudentAge(){
        return studentAge;
}

public void setStudentID(int studentID){
        this.studentID = studentID;
}
public void setStudentName(String studentName){
        this.studentName = studentName;
}
public void setStudentAge(int studentAge){
        this.studentAge = studentAge;
}
public void setStudentAddress(String studentAddress){
        this.studentAddress = studentAddress;
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


