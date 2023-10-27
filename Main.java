public class Main {
  public static void main(String[] args) {
    // 引数の数量を数える
    int numArgs = args.length;

    // 引数が2個以上あるかどうか確認
    if (numArgs < 2) {
      System.out.println("引数を2個以上与えてください");
      return;
    }

    // 引数を数値型に変換
    int[] numbers = new int[numArgs];
    for (int i = 0; i < numArgs; i++) {
      numbers[i] = Integer.parseInt(args[i]);
    }

    // 引数をarg_exampleの形式で出力
    System.out.print("引数:");
    for (int i = 0; i < numArgs; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();

    // 合計、平均、最大値、最小値を計算
    int sum = 0;
    for (int i = 0; i < numArgs; i++) {
      sum += numbers[i];
    }
    double average = (double) sum / numArgs;
    int max = numbers[0];
    int min = numbers[0];
    for (int i = 1; i < numArgs; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      } else if (numbers[i] < min) {
        min = numbers[i];
      }
    }

    // 結果をresult_exampleの形式で出力
    System.out.println("合計：" + sum);
    System.out.println("平均：" + average);
    System.out.println("最大：" + max);
    System.out.println("最小：" + min);
  }
}
