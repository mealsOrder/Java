package chap_06_class.sec10.exam01;

// 스테틱 멤버 or 메서드 사용 예제
public class Cal {
    static double pie = 3.141592;
    static double circleArea(double x) {
        return x * x * pie;
    }
    static int plus(int x, int y) {
        return x+y;
    }
    static int minus(int x, int y) {
        return x-y;
    }
    int len;
    void setLen(int len) {
        this.len = len;
    }
}
