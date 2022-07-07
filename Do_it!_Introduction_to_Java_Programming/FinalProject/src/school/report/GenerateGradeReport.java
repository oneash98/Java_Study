package school.report;

import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.School;

public class GenerateGradeReport {
    School school = School.getInstance();

    public static final String TITLE = " 수강생 학점 \t\t\n";
    public static final String HEADER = "이름 | 학번 |필수과목| 점수 \n";
    public static final String LINE = "--------------------------------\n";

    private StringBuffer buffer = new StringBuffer();

    public String getReport() {
        ArrayList<Subject> subjectList = school.getSubjectList();
        for(Subject subject: subjectList) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        return buffer.toString();
    }

    public void makeHeader(Subject subject) {
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t" + subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);
    }

    public void makeBody(Subject subject) {
        ArrayList<Student> studentList = subject.getStudentList();

        for(int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentID());
            buffer.append(" | ");
            buffer.append(student.getMajorSubject().getSubjectName() + "\t");
            buffer.append(" | ");

            getScoreGrade(student, subject.getSubjectID());

            buffer.append("\n");
            buffer.append(LINE);
        }
    }

    public void getScoreGrade(Student student, int subjectID) {
        ArrayList<Score> scoreList = student.getScoreList();
        int majorID = student.getMajorSubject().getSubjectID();

        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};

        for(int i = 0; i < scoreList.size(); i++) {
            Score score = scoreList.get(i);
            if(score.getSubject().getSubjectID() == subjectID) { // 학점 산출할 과목
                String grade;
                if(score.getSubject().getSubjectID() == majorID) { // 필수 과목인 경우
                    grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
                }
                else { // 일반 과목인 경우
                    grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
                }

                buffer.append(score.getPoint());
                buffer.append(":");
                buffer.append(grade);
                buffer.append(" | ");
            }
        }
    }

    public void makeFooter() {
        buffer.append("\n");
    }
}
