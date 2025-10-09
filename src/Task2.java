import java.util.Scanner;
public class Task2 {
    public static void task22() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число эллементов массива:");
        int a = sc.nextInt();
        int[] b = new int[a];
        for (int i=0;i<a;++i){
            System.out.println("Введите эллемент массива номер"+(i+1)+':');
            int c = sc.nextInt();
            b [i] = c;
        }
        int fi=0;
        int sum=0;
        int max=b[0];
        int min=b[0];
        while (fi<b.length) {
            if (b[fi]>max){
                max=b[fi];
            }
            if (b[fi]<min){
                min=b[fi];
            }
            sum=sum+b[fi];
            fi++;
        }
        System.out.print("Минимальное число массива-" + min+ "\n");
        System.out.print("Максимальное число массива-" + max+ "\n");
        System.out.print("Сумма всех эллементов массива-" + sum);
    }
}
