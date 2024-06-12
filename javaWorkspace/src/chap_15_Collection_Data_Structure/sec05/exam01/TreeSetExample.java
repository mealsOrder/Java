package chap_15_Collection_Data_Structure.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;
// 무작위로 저장한 점수를 검색하는 방법을 보여주는 예제
public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        TreeSet<Integer>scores = new TreeSet<>();
        // TreeSet 에 객체를 저장하면 자동으로 정렬된다.
        // 부모 노드와 비교해서 낮은 것은 왼쪽 자식, 높은것은 오른쪽 자식

        // Integer 객체 생성
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        // 정렬된 Integer 객체를 하나씩 가져오기
        for(Integer s : scores){
            System.out.print(s+" ");
        }
        System.out.println();

        // 특정 Integer 객체를 가져오기
        System.out.println("가장 낮은 점수: "+scores.first());
        System.out.println("가장 높은 점수: "+scores.last());
        System.out.println("95점 아래 점수: "+scores.lower(95));
        System.out.println("95점 위의 점수: "+scores.higher(95));
        System.out.println("95점 이거나 바로 아래 점수: "+scores.floor(95));
        System.out.println("85점 이거나 바로 위의 점수: "+scores.ceiling(85));

        // 내림차순으로 정렬하기
        NavigableSet<Integer>descendingScores = scores.descendingSet();
        for(Integer s : descendingScores){
            System.out.print(s+" ");
        }
        System.out.println();

        // 범위 검색 (80 <= )
        NavigableSet<Integer>rangeSet = scores.tailSet(80,true);
        for(Integer s : rangeSet){
            System.out.print(s+" ");
        }
        System.out.println();

        // 범위 검색 ( 80<= score < 90 )
        rangeSet = scores.subSet(80,true,90,false);
        for(Integer s:rangeSet){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
