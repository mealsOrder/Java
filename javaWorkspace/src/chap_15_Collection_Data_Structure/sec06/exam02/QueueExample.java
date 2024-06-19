package chap_15_Collection_Data_Structure.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue 컬렉션 생성
        Queue<Message>q = new LinkedList<>();

        // 메시지 넣기
        q.offer(new Message("sendEmail","jyj"));
        q.offer(new Message("sendSMS","cola"));
        q.offer(new Message("sendKaKaoTalk","sexy"));

        // 메시지를 하나씩 꺼내어 처리
        while(!q.isEmpty()){
            Message m = q.poll();
            switch (m.command){
                case "sendEmail","sendSMS","sendKaKaoTalk" -> System.out.println(m.to+"님에게 "+m.command+"를(을) 보냅니다.");
            }
        }
    }
}
