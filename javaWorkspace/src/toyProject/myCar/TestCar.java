package toyProject.myCar;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();

        car.setSpeed(88.78);
        System.out.println(car.getSpeed());
        Scanner sc = new Scanner(System.in);


        car.gas= sc.nextInt();



    }
}
