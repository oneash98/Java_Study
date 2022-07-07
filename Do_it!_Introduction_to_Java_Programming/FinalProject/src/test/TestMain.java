package test;

import school.School;
import school.Score;
import school.Subject;
import school.Student;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {
    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;

    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();

        String report = test.gradeReport.getReport();
        System.out.println(report);
    }

    public void createSubject() {
        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.MATH);

        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);
    }

    public void createStudent() {
        Student student1 = new Student(152342, "가가가", korean);
        Student student2 = new Student(115315, "나나나", math);
        Student student3 = new Student(115215, "다다다", korean);
        Student student4 = new Student(164253, "라라라", korean);
        Student student5 = new Student(114225, "마마마", math);

        goodSchool.addStudent(student1);
        goodSchool.addStudent(student2);
        goodSchool.addStudent(student3);
        goodSchool.addStudent(student4);
        goodSchool.addStudent(student5);

        korean.register(student1);
        korean.register(student2);
        korean.register(student3);
        korean.register(student4);
        korean.register(student5);

        math.register(student1);
        math.register(student2);
        math.register(student3);
        math.register(student4);
        math.register(student5);

        addScoreForeStudent(student1, korean, 95);
        addScoreForeStudent(student1, math, 56);

        addScoreForeStudent(student2, korean, 95);
        addScoreForeStudent(student2, math, 95);

        addScoreForeStudent(student3, korean, 100);
        addScoreForeStudent(student3, math, 88);

        addScoreForeStudent(student4, korean, 89);
        addScoreForeStudent(student4, math, 95);

        addScoreForeStudent(student5, korean, 85);
        addScoreForeStudent(student5, math, 56);

    }

    public void addScoreForeStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentID(), subject, point);
        student.addSubjectScore(score);
    }
}
