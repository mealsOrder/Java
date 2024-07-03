package java05;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mon = sc. nextInt();
        int year = sc. nextInt();
        switch (mon){
            case 1,3,5,7,8,10,12:
                System.out.println("31일인 달입니다.");
                break;
            case 4,6,9,11:
                System.out.println("30일인 달입니다.");
                break;
            case 2:
                // 4년주기 마다 29일이 있다.
                // 100년 마다는 빼고
                // 400년 마다 온다
                if((year%4 == 0 && !(year%100 == 0)) || (year%400 == 0)){
                    System.out.println("29일 입니다.");
                } else{
                    System.out.println("28일 입니다.");
                }
                break;
            default:
                System.out.println("입력을 잘못함");
        }
    }
}
