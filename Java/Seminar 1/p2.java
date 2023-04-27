/* 2. Вывести все простые числа от 1 до 1000

 */

public class p2 {
  public static boolean isSimple(int num) {
    double s = Math.sqrt(num);
    for (int i = 2; i <= s; i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    for (int i = 2; i < 1000; i++) {
      if (isSimple(i))
        System.out.println(i);
    }
  }
}
