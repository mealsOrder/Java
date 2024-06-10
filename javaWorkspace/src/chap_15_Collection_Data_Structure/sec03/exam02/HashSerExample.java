package chap_15_Collection_Data_Structure.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSerExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<Member>set = new HashSet<Member>();

        // Member 객체 저장
        set.add(new Member("홍길동",19));
        set.add(new Member("홍길동",19));

        System.out.println("총 객체 수 : " + set.size());
    }
}
