package java04;

public class FloatTypeExample {
    public static void main(String[] args) {
        float num1 = 1.1F; // F 꼭 써줘야함
        double num2 = 1.1;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("===========");
        double num3 = 123.456;
        double num4 = 1.23456e2; // e2 >> 뜻은 10^2 이라는 소리
        System.out.println(num3);
        System.out.println(num4);

        float test1 = 0.12345678901234567890F; // 점 아래 7자리 까지 잘려서 나옴
        double test2 = 0.12345678901234567890;
        System.out.println(test1);
        System.out.println(test2);
    }
}
