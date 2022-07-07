package school;

import java.util.ArrayList;

// 싱글톤
public class School {
    private static String SCHOOL_NAME = "Good School";
    private ArrayList<Student> studentList = new ArrayList<Student>(); // 등록된 학생
    private ArrayList<Subject> subjectList = new ArrayList<Subject>(); // 과목 리스트

    private static School instance = new School();

    private School() {}

    public static School getInstance() {
        if(instance == null) {
            instance = new School();
        }
        return instance;
    }

    public ArrayList<Student> getStudentList() {
        return this.studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public ArrayList<Subject> getSubjectList() {
        return this.subjectList;
    }

    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}
