public class ArgTest {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    int aa = 100;
    obj.val = 100;
    // 引数での変数の受け渡し（呼び出す側の変数を関数内の変数に代入）
    // funcB(aa, obj);

    // 代入の場合
    MyClass obj2 = obj;
    obj2.val = 200;

    System.out.println("aa : " + aa);
    System.out.println("obj.val : " + obj.val);
  }

  public static void funcB(int aa, MyClass obj2) {
    aa = 200;
    obj2.val = 200;
  }
}
