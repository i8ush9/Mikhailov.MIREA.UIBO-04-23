import java.util.Scanner;
public class Task5 {
    public static void FUCKtorial() {
        System.out.print("Введите число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
        }
        System.out.print("Факториал вашего числа:" + b);
    }
}
