package chap_06_class.sec09.exam01;

public class Car {
    // 필드 선언
    String model;
    int speed;

    // 생성자 선언
    Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run(){
        this.speed = 100;
        System.out.println(this.model+"가 달립니다."+this.speed+"km/h 속력으로");
    }

}
