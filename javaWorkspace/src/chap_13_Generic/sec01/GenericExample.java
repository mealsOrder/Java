package chap_13_Generic.sec01;

public class GenericExample {
    public static void main(String[] args) {
        // Box 생성할때 타입 파라미터 T 대신 String 으로 대체
        Box<String>box1 = new Box<>();
        box1.content = "안녕하세요.";
        String str = box1.content;
        System.out.println(str);

        // Box 생성할때 타입 파라미터 T 대신 Integer 로 대체
        Box<Integer>box2 = new Box<>();
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);
    }
}
