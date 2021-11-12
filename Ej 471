package aceptaelreto2;

import java.util.Scanner;

public class Ej471 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        int pI, pF;

        for (int i = 0; i < casos; i++) {

            pI = sc.nextInt();
            pF = sc.nextInt();

            int dif1 = Math.abs(pI - pF);

            if (dif1 == 180 || pI == pF) {
                System.out.println("DA IGUAL");
            }
            else if (pI < pF) {
                if (pF - pI < 180) {
                    System.out.println("ASCENDENTE");
                } else {
                    System.out.println("DESCENDENTE");
                }
            } else if (pI > pF) {
                if (pI - pF < 180) {
                    System.out.println("DESCENDENTE");
                } else {
                    System.out.println("ASCENDENTE");
                }
            }
        }
    }
}
