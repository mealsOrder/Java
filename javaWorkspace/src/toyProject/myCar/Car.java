package toyProject.myCar;

public class Car {
    // 인스턴스 필드
    String model;
    String color;

    int weight;
    private double speed;
    private boolean stop;
    double acc;
    int price;
    int gas;
    // 생성자 선언
    Car(){

    }
    Car(String model, String color, int weight, double speed, double acc, int price,int gas){
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
        this.acc = acc;
        this.price = price;
        this.gas = gas;
    }

    // 인스턴스 메소드
    void go(){
        this.speed = this.speed + this.acc;
    }
    // 개터
    public double getSpeed(){
        return speed;
    }
    // 세터
    public void setSpeed(double speed){
        if(speed<0){
            this.speed = 0;
            return;
        }
        else{
            this.speed = speed;
        }
    }

    // stop 필드의 개터와 세터
    public boolean isStop(){
        return stop;
    }
    public void setStop(boolean stop){
        this.stop = stop;
        if(stop) this.speed = 0;
    }
}
