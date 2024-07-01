package java01;

public class MethodExample {
    // 외부에서 사용하려면 new 로 객체를 생성해서 사용 해야한다.
    int add(int a,int b, int c){
        return a+b+c;
    }

    /*
     new 로 객체를 생성해서 사용하기 싫으면 static 키워드를 붙여주면 된다.
     static int add(int a,int b, int c){
        return a+b+c;
    }
    */
    public static void main(String[] args) {

        MethodExample me = new MethodExample();
        int kor = 90;
        int eng = 99;
        int mat = 91;

        System.out.println(me.add(kor,eng,mat));
        //System.out.println(add(kor,eng,mat));// 스테틱 키워드로 add 함수를 정의했을때
    }
}
