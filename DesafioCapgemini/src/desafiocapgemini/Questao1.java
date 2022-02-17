package desafiocapgemini;

import java.util.Scanner;

public class Questao1 {

    static void escada(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = tcl.nextInt();
        escada(n);
        tcl.close();
    }

}
