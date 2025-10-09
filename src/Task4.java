public class Task4 {
    public static void task44() {
        double a;
        System.out.print("Первые 10 чисел канонического ряда: ");
        for (int i=1;i<=10;i++) {
            a = 1.0/i;
            String b = String.format("%.3f", a);
            System.out.print(b+" ");
        }
    }
}