package school;

import java.util.ArrayList;
import utils.Define;

public class Subject {
    private String subjectName; // 과목 이름
    private int subjectID; // 과목 고유 번호
    private int gradeType; // 학점 평가 정책

    private ArrayList<Student> studentList = new ArrayList<Student>();

    public Subject(String subjectName, int subjectID) {
        this.subjectName = subjectName;
        this.subjectID = subjectID;
        this.gradeType = Define.AB_TYPE; // 학점 평가 정책
    }

    public String getSubjectName() {
        return this.subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectID() {
        return this.subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getGradeType() {
        return this.gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return this.studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    // 수강 신청 메서드
    public void register(Student student) {
        studentList.add(student);
    }
}
