package chap_06_class.sec10.exam01;

import java.util.Scanner;
// 스테틱
public class CalEx {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println("정수 두개를 입력하세요");
        Scanner sc = new Scanner(System.in);
        c.setLen(5);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double res1 = 10*10*Cal.pie;
        int res2 = Cal.minus(a,b);
        int res3 = Cal.plus(a,b);
        double res4 = Cal.circleArea(res1);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
        System.out.println("res4 = " + res4);
    }
}
