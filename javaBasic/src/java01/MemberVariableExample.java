package java01;

public class MemberVariableExample {
    // 맴버 변수
    static int a;
    static int b;
    String name;
    int age;

    public MemberVariableExample(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        int c=a+b;
        System.out.println(c);

        MemberVariableExample mv = new MemberVariableExample("홍길동",19);

        System.out.println(mv.name+" "+mv.age);
        mv.setName("박첨지");
        mv.setAge(22);
        System.out.println(mv.name+" "+mv.age);

    }
}
