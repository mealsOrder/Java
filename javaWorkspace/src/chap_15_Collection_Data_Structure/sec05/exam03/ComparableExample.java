package chap_15_Collection_Data_Structure.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        //TreeSet 컬렉션 생성
        TreeSet<Person>treeSet = new TreeSet<Person>();

        // 객체 저장
        treeSet.add(new Person("홍길동",45));
        treeSet.add(new Person("김자바",25));
        treeSet.add(new Person("박지원",31));

        // 객체를 하나씩 가져오기
        for(Person o: treeSet){
            System.out.println(o.name+": "+o.age);
        }
    }
}
