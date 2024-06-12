package chap_15_Collection_Data_Structure.sec04.exam02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        // Hashtable 컬렉션 생성
        Map<String,Integer>map = new Hashtable<>();
        // 만약 HashMap으로 선언하면 두 스레드가 동시에 put() 메소드를 호출 할수 있기에
        // 경합이 발생하고 결국은 하나만 저장되기 때문 ex) 총 엔트리 수: 1989개
        // 반면에 Hashtable 로 선언하면 put()은 동기화 메소드이므로
        // 한번에 하나의 스레드만 실행 할 수 있어 경합이 발생하지 않는다. ex) 총 엔트리 수 : 2000

        //작업 스레드 객체 생성
        Thread threadA = new Thread(){
            @Override
            public void run(){
                // 앤트리 1000개 추가
                for(int i=1;i<=1000;i++){
                    map.put(String.valueOf(i),i);
                }
            }
        };

        // 작업 스레드 객체 생성
        Thread threadB = new Thread(){
            @Override
            public void run(){
                // 앤트리 1000개 추가
                for(int i=1001;i<=2000;i++){
                    map.put(String.valueOf(i),i);
                }
            }
        };

        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        // 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
        try{
            threadA.join();
            threadB.join();
        }catch (Exception e){
        }

        // 저장된 총 엔트리 수 얻기
        int size = map.size();
        System.out.println("총 엔트리 수: "+ size);
        System.out.println();
    }
}
