package hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student();
        studentKim.setStudentName("김한재");

        System.out.println(studentKim.getStudentName());
    }
}
