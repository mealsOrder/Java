package java04;

import java.util.Scanner;

public class Test3 {

    public int myAdd(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test3 t = new Test3();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = add(num1,num2);
        int myRes = t.myAdd(num1,num2);
        System.out.printf("두 수의 합은 %d입니다.\n",res);
        System.out.printf("객체 생성 해서 합은 %d입니다.\n",myRes);
        sc.close();
    }

    public static int add(int a,int b){
        return a+b;
    }
}
