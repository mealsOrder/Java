package chap_06_class.sec08.exam01;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.powerOn();
        int res1 = calc.plus(20,30);
        System.out.println("res1 = " + res1);

        double res2 = calc.div(50,2);
        System.out.println("res2 = " + res2);
        int x =10;
        int y = 0;
        double res3 = calc.div(x,y);
        System.out.println("res3 = " + res3);


        calc.powerOff();
    }
}
