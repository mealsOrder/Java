package java04;

public class CastingExample {
    public static void main(String[] args) {
        byte a = 100;
        int b = a; // 암시적(묵시적) 형변환
        byte c = (byte) b; // 명시적 형변환
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        char a1 = 'A';
        char a2 = '가';
        int a3 = a2; // 0xAC00
        double d1 = 56.789;
        short a4 = (short) a1;
        short a5 = (short) a2;
        System.out.println(a1 + " " + (int)a1);
        System.out.println(a2 + " " + (int)a2);
        System.out.println(a4);
        System.out.println((char)a5);
    }
}
