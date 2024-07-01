package java01;

public class Test1 {
    static int myFunc(int x){
        int y=0;
        int a = 3;
        int b = 10;
        y = a*x + b;
        return y;
    }
    public static void main(String[] args) {
        int res = myFunc(10);
        System.out.println(res);
        float var2 = 3.14f;
    }
}
