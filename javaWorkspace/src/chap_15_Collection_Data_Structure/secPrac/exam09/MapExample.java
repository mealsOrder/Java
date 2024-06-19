package chap_15_Collection_Data_Structure.secPrac.exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        // 평균점수 최고점수 최고점수를 받은 id를 출력하는 코드를 작성
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
            if(entry.getValue() > maxScore){
                maxScore = entry.getValue();
                name = entry.getKey();
            }
            totalScore += entry.getValue();
        }
        int avg = totalScore / map.size();
        System.out.println("평균 점수: "+avg);
        System.out.println("최대 점수: "+maxScore);
        System.out.println("최고 점수를 받은 아이디: "+name);
    }
}
