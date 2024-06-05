package chap_06_class.sec08.exam04;

public class Calculator {
    // 오버로딩 연습

    // 매개변수 하나 받으면 정사각형 넓이
    double sq(double x) {
        return x * x;
    }
    // 매개변수 두개 받으면 직사각형 넓이
    double sq(double x,double y) {
        return x*y;
    }

}
