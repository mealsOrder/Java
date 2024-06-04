package toyProject.lotto;

import java.util.Random;

public class Lotto_1 {
    public static void main(String[] args) {
        // 로또번호자동 생성기
        // 1부터 45까지의 숫자 중에서 중복 없이 6개의 숫자를 랜덤하게 생성
        Random random = new Random();
        int[] lottoNumber = new int[6];

        for(int i = 0; i < 6; i++) {
            int number = random.nextInt(45)*1;
            for(int j=0;j<i;j++){
                if(lottoNumber[j] == number ){
                    number = random.nextInt(45)+1;
                    j = -1;
                }
            }
            lottoNumber[i] = number;
        }
        System.out.print("이번주 로또 번호 : ");
        for(int number : lottoNumber){
            System.out.print("["+number+"]");
        }
    }
}
