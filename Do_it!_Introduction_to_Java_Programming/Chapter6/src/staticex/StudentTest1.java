package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentKim = new Student();
        studentKim.setStudentName("김한재");
        System.out.println(studentKim.serialNum);
        studentKim.serialNum++;

        Student student2 = new Student();
        student2.setStudentName("임지언");
        System.out.println(student2.serialNum);
        System.out.println(studentKim.serialNum);
    }
}
