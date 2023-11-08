import java.util.Scanner;

public class HitAndBlowGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hit = 0;
        int blow = 0;
        int secret = (int) (Math.random() * 10000);
        int guess = 0;
        boolean flag = false;
        while (!flag) {
            System.out.println("4桁の数字を入力してください");
            guess = sc.nextInt();
            hit = 0;
            blow = 0;
            for (int i = 0; i < 4; i++) {
                if (guess % 10 == secret % 10) {
                    hit++;
                }
                if (guess / 1000 == secret / 1000) {
                    blow++;
                }
                guess /= 10;
                secret /= 10;
            }
            System.out.println("ヒット" + hit + "ブロー" + blow);
            if (hit == 4) {
                flag = true;
            }
        }
        System.out.println("正解");
    }
}
