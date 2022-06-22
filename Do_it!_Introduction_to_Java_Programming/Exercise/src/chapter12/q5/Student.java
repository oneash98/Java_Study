package chapter12.q5;

public class Student {
    int studentID;
    String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public int hashCode() {
        return studentID;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student std =  (Student)obj;
            if(this.studentID == std.studentID) {
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return studentID + ":" + studentName;
    }
}
