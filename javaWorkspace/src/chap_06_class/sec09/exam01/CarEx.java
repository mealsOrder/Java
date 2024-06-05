package chap_06_class.sec09.exam01;

public class CarEx {
    public static void main(String[] args) {
        Car c1 = new Car("벤츠",100);
        Car c2 = new Car("포르쉐",120);

        c1.run();
        c2.run();
    }
}
