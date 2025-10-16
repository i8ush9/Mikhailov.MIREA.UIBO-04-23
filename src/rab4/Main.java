package rab4;
import java.util.Scanner;
import static rab4.PrintILove.printIlove;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите время года:");
        String a = sc.next();
        YearNames season = YearNames.valueOf(a.toUpperCase());
        printIlove(season);

        for (YearNames i : YearNames.values()) {
            double bib = i.getYearNames();
            String bob = i.getDescription();
            System.out.println(i + " | " + bib + " | " + bob);
        }

        YearNames temp = YearNames.SPRING;

        YearNames favorite = YearNames.SPRING;
        System.out.println("Любимое время года - " + favorite + );


    }
}
