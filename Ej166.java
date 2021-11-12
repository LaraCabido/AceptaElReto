package aceptaelreto2;

import java.util.Scanner;

public class Ej166 {

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        while (a != 0 && b != 0) {
            if (a > b) {
                c = a - b;
                d = 99 - a + b;
            } else {
                c = b - a;
                d = 99 - b + a;
            }
            if (c < d) {
                System.out.println(c);
            } else {
                System.out.println(d);
            }
            a = sc.nextInt();
            b = sc.nextInt();
        }

    }
}
