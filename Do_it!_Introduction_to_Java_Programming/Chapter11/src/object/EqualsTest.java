package object;

class Student{
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return studentName + "," + studentName;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "이상원");

        if(studentLee == studentLee2) {
            System.out.println("같다");
        }
        else {
            System.out.println("다르다");
        }

        if(studentLee.equals(studentLee2)) {
            System.out.println("같다");
        }
        else {
            System.out.println("다르다");
        }

        if(studentLee == studentSang) {
            System.out.println("같다");
        }
        else {
            System.out.println("다르다");
        }

        if(studentLee.equals(studentSang)) {
            System.out.println("같다");
        }
        else {
            System.out.println("다르다");
        }
    }
}
