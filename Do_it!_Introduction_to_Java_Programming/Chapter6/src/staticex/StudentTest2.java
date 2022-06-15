package staticex;

public class StudentTest2 {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.setStudentName("김한재");
        System.out.println(student1.serialNum);
        System.out.println(student1.studentID);

        Student1 student2 = new Student1();
        student2.setStudentName("임지언");
        System.out.println(student2.serialNum);
        System.out.println(student2.studentID);
    }
}
