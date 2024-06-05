package chap_06_class.sec08.exam01;

public class Calculator {
    // 리턴값이 없는 메소드 선언
    void powerOn(){
        System.out.println("Power on");
    }
    void powerOff(){
        System.out.println("Power off");
    }
    int plus(int a,int b){
        return a+b;
    }
    double div(int a, int b){
        if(b == 0){
            System.out.println("Cannot divide by zero");
        }
        return (double)a/(double)b;
    }

}
