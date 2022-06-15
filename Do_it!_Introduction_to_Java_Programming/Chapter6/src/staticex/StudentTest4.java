package staticex;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 studentKim = new Student2();
        studentKim.setStudentName("김한재");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentKim.studentID);
    }
}
