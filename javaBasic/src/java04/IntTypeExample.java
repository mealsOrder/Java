package java04;

public class IntTypeExample {
    public static void main(String[] args) {
        // 정수형 변수
        // byte: -128 ~ 127
        // short: -32768 ~ 32767
        // char: 0 ~ 65535 (유니코드 범위)
        // int: 약 -21억 ~ 21억
        // long: 약 -922경 ~ 922경
        byte a = 127; // -128 ~ 127
        short b = 32767; // -32768 ~ 32767
        int c = 210000000; // -21억 ~ 21억
        long d = 9223372036854775807L; // L꼭 써줘야함!
        System.out.println(c);
        System.out.printf("%d %d %d %d",a,b,c,d);
    }
}
