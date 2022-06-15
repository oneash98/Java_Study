package classpart;
public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }
    public static void main(String[] args) {
        Student studentKim = new Student();
        studentKim.studentName = "김한재";

        System.out.println(studentKim.studentName);
        System.out.println(studentKim.getStudentName());
    }
}
