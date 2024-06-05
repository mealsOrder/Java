package chap_06_class.sec08.exam04;

import java.util.Scanner;

public class CalculatorEx {
    public static void main(String[] args) {
        // 객체 생성
        Calculator c = new Calculator();
        System.out.println("실수 두개를 입력 하세요. ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double rectangle = c.sq(a);
        double xyRectangle = c.sq(a,b);
        System.out.println("rectangle = " + rectangle);
        System.out.println("xyRectangle = " + xyRectangle);
    }
}
