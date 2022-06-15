package arraylist;
import java.util.ArrayList;

public class Student {
    int studentId;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for(Subject s: subjectList) {
            total += s.getScorePoint();
        }
        System.out.println(studentName + total);
    }
}
