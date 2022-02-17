package desafiocapgemini;

import java.util.Scanner;

public class Questao1 {

    static void escada(int n) {
        
        for (int i = 1; i <= n; i++) {          //para cada linha, sendo n o numero de andares da escada
            for (int j = 1; j <= n - i; j++) {  
                System.out.print(" ");          //colocar os espaços em branco 
            }
            for (int k = 1; k <= i; k++) {      //colocar os asteriscos 
                System.out.print("*");
            }
            System.out.println("");             //ao final do loop, começar uma nova linha
        }
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = tcl.nextInt();                  //entrar com o número de andares para a escada
        escada(n);                              //chamar a função
        tcl.close();
    }

}
