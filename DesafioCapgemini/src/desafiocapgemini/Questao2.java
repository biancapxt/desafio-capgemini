package desafiocapgemini;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int cont = 0;
        String num[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String letraMinus[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String letraMaius[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String caracEspecial[] = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"};
        System.out.println("Digite a senha: ");
        String senha = tcl.nextLine();

        for (String n : num) {
            if (senha.contains(n)) {
                cont++;
                break;
            }
        }

        for (String l : letraMinus) {
            if (senha.contains(l)) {
                cont++;
                break;
            }
        }

        for (String u : letraMaius) {
            if (senha.contains(u)) {
                cont++;
                break;
            }
        }

        for (String c : caracEspecial) {
            if (senha.contains(c)) {
                cont++;
                break;
            }
        }
        if (6 - senha.length() > 4 - cont) {
            System.out.println(6 - senha.length());
        } else {
            System.out.println(4 - cont);
        }
    }
}
