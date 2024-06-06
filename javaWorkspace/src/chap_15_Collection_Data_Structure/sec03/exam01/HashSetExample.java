package chap_15_Collection_Data_Structure.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<String> set = new HashSet<String>();

        // 객체 저장
        set.add("JAVA");
        set.add("JDBC");
        set.add("JSP");
        set.add("JAVA"); // 중복이므로 저장 안됨!
        set.add("SPRING");

        // 저장된 객체 수 출력
        int size = set.size();
        System.out.println("저장된 총 객체 수: "+size); // 4
    }
}
