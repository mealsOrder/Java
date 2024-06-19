package chap_15_Collection_Data_Structure.secPrac.exam08;

import java.util.HashSet;
import java.util.Set;
public class HashSetExample {
    public static void main(String[] args) {
        Set<Student>set = new HashSet<Student>();

        set.add(new Student(1,"홍길동"));
        set.add(new Student(2,"박정우"));
        set.add(new Student(1,"감스트"));
        System.out.println("저장된 객체 수: " + set.size());
        for(Student s : set){
            System.out.println(s.studentNum+":"+s.name);
        }

    }
}
