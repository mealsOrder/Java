package prac;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(35);
        System.out.println(35+30);

        // 정수
        int x = 30;
        long l = 30L;
        short s = 30;
        byte b = 30;
        System.out.println(x+20);

        int ii=(int)30L;
        int ll = 30; // int

        double dd= 30.0;
        float ff =30.0f;

        dd =ff;
        ff =(float)dd;

        boolean flag = true;

        char c='a';
        char cc = '한';

        String str = "여러 글자";
        System.out.printf("저는%s 입니다. 나이는 %d 키는 %f입니다.\n","홍길동",20,100.5f);
        String str2 = String.format("저는%s 입니다. 나이는 %d 키는 %.3f입니다.\n","홍길동",20,100.5f);
        System.out.println(str2);

        System.out.println(Math.max(30,10));
        System.out.println(Math.min(10,990));
        System.out.println(Math.abs(-309));

        String str3 = "100";
        int aa = Integer.parseInt(str3);
        long aaa = Long.parseLong(str3);

        String str4 = String.valueOf(aa);
        System.out.println(aa);
        System.out.println(str4);
        Random random = new Random();
        int rand = random.nextInt(10); // 0~9 까지

        // 입력
        System.out.println("4개 입력하세요");
        Scanner sc = new Scanner(System.in);
        String er = sc.next();
        int err = sc.nextInt();
        long el = sc.nextLong();
        System.out.println(sc.next());
        System.out.println(rand);
        System.out.println();

        // 조건문
        int aaaa = 10;
        if(aaaa<5) {
            System.out.println("거짓");
        }else if(aaaa<12) {
            System.out.println("참");
        }else{
            System.out.println("나머지");
        }

        // 삼항 연산자
        boolean isMarried = true;
        boolean isMan = false;

        String ss;
        ss = isMarried ?"기혼":"미혼";
        if(isMarried || isMan){
            ss = "기혼";
        }
        else{
            ss = "미혼";
        }
        System.out.println(ss);

        switch(ss){
            case "기혼":
                System.out.println("0");
                break;
            case "미혼":
                System.out.println("1");
                break;
            default:
                System.out.println("?");
        }

        // for 문
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if(i == 6){
                continue;
            }
            if(i==8){
                System.out.println("8에서 종료합니다.");
                break;
            }
        }
        int tc=0;
        while(tc<10){
            System.out.print(tc);
            tc++;
        }
        tc=0;
        do{
            System.out.print(tc);
            tc++;
        }while(tc<10);

        // 배열
        // 값을 직접 초기화 하려면 아래처럼
        int[] score1 = new int[] {10,20,30,40,50};
        int[] score2 = {10,20,30,40,50};
        int[] score3 = new int[5];
        int count = score1.length;
        System.out.println(count);
        System.out.println(score1[1]);
        // 마지막 인덱스 숫자 출력시 배열 길이에서 하나 뺀 값 출력 해주자 (0부터 사용시)
        System.out.println(score1[score1.length-1]);

        String[] namnes = {"홍길동","이순신"};
        String[] grand = new String[2];
        System.out.println(grand[0]); // null

        // null 인 변수 참조해서 뭔가를 하려고 하면 exception 뜸
        // es) grand[0].length(); >> null point exception

        // 사용하기 불편한 배열

        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(10);
        scoreList.add(10);
        scoreList.add(10);
        scoreList.add(10);
        scoreList.add(10);
        scoreList.add(2,200 );
        scoreList.remove(2);
        System.out.println(scoreList.size());
        System.out.println(scoreList.get(3));

    }
}
