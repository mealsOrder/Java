package chap_06_class.sec06.exam01;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    boolean start;
    int maxSpeed;
    int speed;

    // 생성자 선언
    Car(){ }
    Car(String company){
        this.company = company;
    }
    Car(String company, String color){
        this.company = company;
        this.color=color;
    }
    Car(String company, String color,String model){
        this.company = company;
        this.color=color;
        this.model=model;
    }

}
