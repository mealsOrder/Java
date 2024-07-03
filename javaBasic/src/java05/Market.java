package java05;

import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("==========[메뉴]==========");
            System.out.println("i,u,d, 또는 exit 입력하세요");
            System.out.println("=========================");
            String input = sc.nextLine();

            if(input.toLowerCase().equals("exit")) {
                System.out.println("종료");
                break;
            } else if(input.equals("i")){
                System.out.println("입력");
            } else if(input.equals("u")){
                System.out.println("수정");
            } else if(input.equals("d")) {
                System.out.println("삭제");
            } else{
                System.out.println("잘못 입력함");
            }

        }
    }
}
