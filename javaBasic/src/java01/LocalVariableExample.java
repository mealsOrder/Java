package java01;

public class LocalVariableExample {
    public static void main(String[] args) {
        // 지역 변수 (초기화 하고 사용해야함)
        int a=10; // 초기화 10을 대입
        int b=20;
        int c = a+b;
        int d; // 초기화 되지 않은 변수
        System.out.println(c);
        // System.out.println(d); // Error!
    }
}
