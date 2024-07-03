package java05;

import java.util.Scanner;

public class OperationClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n1 = sc.nextInt();
        String op = sc.next();
        int n2 = sc.nextInt();

        switch (op){
            case "+":
                System.out.println(n1+n2);
                break;
            case "-":
                System.out.println(n1-n2);
                break;
            case "*":
                System.out.println(n1*n2);
                break;
            case "/":
                System.out.println(n1/n2);
                break;

        }
    }
}
