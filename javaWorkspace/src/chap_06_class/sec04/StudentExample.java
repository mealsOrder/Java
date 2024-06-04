package chap_06_class.sec04;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("변수가 Student 객체를 창조합니다.");
        System.out.println(s1.name);

    }
}


class Student {
    String name = "장윤재";
}