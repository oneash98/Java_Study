package chapter12.q5;

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();
        set.add(new Student(100, "홍"));
        set.add(new Student(200, "강"));
        set.add(new Student(300, "이"));
        set.add(new Student(400, "정"));
        set.add(new Student(100, "송"));

        System.out.println(set);
    }
}