import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HitAndBlowGame {
    public static void main(String[] args) {
        int numberLength = 4; // 秘密の数字の桁数
        int maxNumber = 9; // 0から9までの数字を使用
        List<Integer> secretNumber = generateSecretNumber(numberLength, maxNumber);

        System.out.println("Hit & Blowゲームを開始します。");
        System.out.println("0から9までの数字を" + numberLength + "桁のコンビネーションを推測してください。");

        int attempts = 0;
        boolean hasGuessed = false;

        while (!hasGuessed) {
            int[] guess = getUserGuess(numberLength);
            attempts++;

            if (checkGuess(secretNumber, guess)) {
                System.out.println("正解です！秘密の数字は " + listToString(secretNumber) + " でした。");
                System.out.println("あなたは " + attempts + " 回で正解しました。");
                hasGuessed = true;
            } else {
                int hits = countHits(secretNumber, guess);
                int blows = countBlows(secretNumber, guess);
                System.out.println("ヒット: " + hits + ", ブロウ: " + blows);
            }
        }
    }

    // 秘密の数字を生成
    private static List<Integer> generateSecretNumber(int length, int maxNumber) {
        Random rand = new Random();
        List<Integer> secretNumber = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            secretNumber.add(rand.nextInt(maxNumber + 1));
        }
        return secretNumber;
    }

    // ユーザーからの推測を受け取る
    private static int[] getUserGuess(int length) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("推測する" + length + "桁の数字を入力してください: ");
        String input = scanner.nextLine().trim();

        int[] guess = new int[length];
        for (int i = 0; i < length; i++) {
            guess[i] = Character.getNumericValue(input.charAt(i));
        }
        return guess;
    }

    // 推測が正しいかチェック
    private static boolean checkGuess(List<Integer> secretNumber, int[] guess) {
        for (int i = 0; i < secretNumber.size(); i++) {
            if (secretNumber.get(i) != guess[i]) {
                return false;
            }
        }
        return true;
    }

    // ヒットの数をカウント
    private static int countHits(List<Integer> secretNumber, int[] guess) {
        int hits = 0;
        for (int i = 0; i < secretNumber.size(); i++) {
            if (secretNumber.get(i) == guess[i]) {
                hits++;
            }
        }
        return hits;
    }

    // ブロウの数をカウント
    private static int countBlows(List<Integer> secretNumber, int[] guess) {
        int blows = 0;
        for (int i = 0; i < secretNumber.size(); i++) {
            if (secretNumber.contains(guess[i]) && secretNumber.get(i) != guess[i]) {
                blows++;
            }
        }
        return blows;
    }

    // リストを文字列に変換
    private static String listToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Integer number : list) {
            sb.append(number);
        }
        return sb.toString();
    }
}
