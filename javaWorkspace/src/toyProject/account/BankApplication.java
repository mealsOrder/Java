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
                withDraw();
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
        Account newAccount = new Account(ano,name,balance);
        for(int i=0;i<accountArr.length;i++){
            if(accountArr[i] == null){
                accountArr[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌 목록보기
    private static void accountList(){
        System.out.println("------------");
        System.out.println("계좌목록");
        System.out.println("------------");
        for(int i=0;i<accountArr.length;i++){
            Account account = accountArr[i];
            if(account != null){
                System.out.print(account.getAccountNumber());
                System.out.print("        ");
                System.out.print(account.getName());
                System.out.print("        ");
                System.out.println(account.getBalance());
            }
        }
    }

    //예금하기
    private static void deposit(){
        System.out.println("------------");
        System.out.println("예금");
        System.out.println("------------");
        System.out.println("계좌번호");
        String accountNumber =sc.nextLine();
        System.out.println("예금액");
        int depositMoney = Integer.parseInt(sc.nextLine());
        Account account = findAccount(accountNumber);
        if(account == null){
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + depositMoney);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    //출금
    private static void withDraw(){
        System.out.println("------------");
        System.out.println("출금");
        System.out.println("------------");
        System.out.println("계좌번호: ");
        String accountNumber = sc.nextLine();
        System.out.println("출금액: ");
        int withDrawMoney = Integer.parseInt(sc.nextLine());
        Account account = findAccount(accountNumber);
        if(account == null){
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance()-withDrawMoney);
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    //Account 배열에서 accountNumber와 동일한 Account 객체 찾기
    private static Account findAccount(String accountNumber){
        Account account = null;
        for(int i=0;i<accountArr.length;i++){
            if(accountArr[i] != null){
                String dbAccountNumber = accountArr[i].getAccountNumber();
                if(dbAccountNumber.equals(accountNumber)){
                    account = accountArr[i];
                    break;
                }
            }
        }
        return account;
    }
}
