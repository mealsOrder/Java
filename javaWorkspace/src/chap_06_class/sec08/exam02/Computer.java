package chap_06_class.sec08.exam02;

public class Computer {
    // 가변 길이 매개변수를 갖는 메서드
    int sum(int ...values){
        int sum = 0;

        //for(int i=0;i<values.length;i++) sum += values[i];
        for(int i : values){
            sum += i;
        }
        return sum;
    }
}
