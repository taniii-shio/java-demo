class Sample1 {
  public static void main(String[] args) {
    // int num1 = 100;
    // int num2, num3;
    // String str1;

    // num2 = 200;
    // num3 = 300;
    // str1 = "Good Bye!";

    // System.out.println("Hello Java World");
    // System.out.println(500);
    // System.out.println(num1);
    // System.out.println(num2);
    // System.out.println("num3の値は " + num3 + " です");
    // System.out.println(str1);

    // 参照型変数例
    int a[] = {1};
    int b[] = a;
    b[0] = 2;
    System.out.println(a[0]);
    System.out.println(b[0]);
    int c[] = {3};
    b = c;
    System.out.println(b[0]);

    b[0] = 4;
    System.out.println(a[0]);
    System.out.println(b[0]);
    System.out.println(c[0]);
  }
}
