package chap_06_class.sec08.exam03;

import java.util.Scanner;

public class CarEx {
    public static void main(String[] args) {
        Car c = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gas: ");
        int g = sc.nextInt();
        c.setGas(g);

        if(c.isLeftGas()){
            System.out.println("start");
            c.run();
        }
        else{
            System.out.println("Can't go");
        }
    }

}
