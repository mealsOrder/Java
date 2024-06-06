package toyProject.account;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArr = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("-------------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택>");

            int selecNum = Integer.parseInt(sc.nextLine());
            if(selecNum == 1){
                creatAccount();
            }else if(selecNum == 2){
                accountList();
            }else if (selecNum == 3){
                deposit();
            }else if(selecNum == 4){
                withDraw()
            }else if(selecNum == 5){
                run = false;
            }else{
                System.out.println("잘못된 명령어를 입력했습니다.");
                System.out.println("다시 입력하세요.");
            }

        }
        System.out.println("프로그램 종료.");
    }
    // 계좌 생성하기
    private static void creatAccount(){
        System.out.println("------------");
        System.out.println("계좌생성");
        System.out.println("------------");
        System.out.print("계좌번호: ");
        String ano = sc.nextLine();
        System.out.print("계좌주: ");
        String name = sc.nextLine();
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(sc.nextLine());
        System.out.println("결과: 계좌가 생성되었습니다.");
        Account newAccount = new Account(ano,name,balance);
        //97페이지
    }

}
