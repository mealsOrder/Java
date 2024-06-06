package chap_15_Collection_Data_Structure.sec02.exam02;

import chap_15_Collection_Data_Structure.sec02.exam01.Board;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // vector 컬랙션 생성
        List<Board> list = new Vector<>();

        // 작업스레드 객체 생성
        Thread threadA = new Thread(){
            @Override
            public void run(){
               // 객체 1000개 추가
               for(int i=0;i<1000;i++){
                   list.add(new Board("제목"+i,"내용"+i,"저자"+i));
               }
            }
        };

        // 작업 스레드 객체 생성
        Thread threadB =new Thread(){
            @Override
            public void run(){
                //객체 1000개 추가
                for(int i=0;i<1000;i++){
                    list.add(new Board("제목"+i,"내용"+i,"저자"+i));
                }
            }
        };

        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        // 작업 스레드가 모두 종료될 때까지 메인 스레드를 기다리게 함
        try{
            threadA.join();
            threadB.join();
        } catch (Exception e){

        }

        // 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.print("총 객체 수: "+size);
        System.out.println();


    }
}
