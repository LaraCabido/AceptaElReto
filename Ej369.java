
package aceptaelreto2;

import java.util.Scanner;

public class Ej369 {
    public static void main(String[] args) {
        int a, suma;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while (a != 0){
            for (int i = 0; i < a; i++){
                System.out.print("1");
            }
            System.out.println();
            a = sc.nextInt();
        }
    }
}
