package toyProject.lotto;

import java.util.Scanner;

public class Lotto_2 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("로또게임입니다...");
            System.out.print("사용자 이름을 만들어 주세요 : ");
            String name = sc.nextLine();
            System.out.println("명령어");
            System.out.println("[1]계속 [2]종료");
            int exitNum = sc.nextInt();
            if (exitNum == 2){
                System.out.println("종료합니다. 감사합니다.");
                break;
            }

            int[] lotto = new int[6];
            int[] myLotto = new int[6];

            int count = 0;

            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = (int) (Math.random() * 45) + 1;
                for (int j = 0; j < i; j++) {
                    if (lotto[i] == myLotto[j]) {
                        i--;
                        break;
                    }
                }

            }

            for (int i = 0; i < 6; i++) {
                System.out.print(i + 1 + "번째 로또 번호 입력 : ");
                myLotto[i] = sc.nextInt();
                if (myLotto[i] < 1 || myLotto[i] > 45) {
                    System.out.println(name + "님!! 로또번호는 1에서 45까지 입니다.");
                    i--;
                    continue;
                }
                for (int j = 0; j < i; j++) {
                    if (myLotto[i] == myLotto[j]) {
                        System.out.println(name + "님!! 로또번호는 중복될 수 없습니다!");
                        i--;
                        break;
                    }
                }
            }

            for (int k : lotto) {
                for (int i : myLotto) {
                    if (k == i) {
                        count++;
                    }
                }
            }

            System.out.printf("이번주 로또번호 추첨 : [%d][%d][%d][%d][%d][%d]입니다. \n",
                    lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5]);
            System.out.println(name + "님!! 로또번호" + count + "개를 맞추셨습니다.");
            switch (count) {
                case 6:
                    System.out.println(name + "님!! 1등 당첨!! 20억 축하드립니다!");
                    break;
                case 5:
                    System.out.println(name + "님!! 2등 당첨!! 5000만원 축하드립니다.");
                    break;
                case 4:
                    System.out.println(name + "님!! 4등 당첨!! 50,000원 축하드립니다.");
                    break;
                case 3:
                    System.out.println(name + "님!! 5등 당첨!! 5,000 원 축하드립니다.");
                    break;
                default:
                    System.out.println(name + "님!! 이번주는 꽝입니다...");
            }
        }


    }
}
