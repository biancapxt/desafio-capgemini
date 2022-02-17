package desafiocapgemini;

import java.util.Scanner;

public class Questao2 {

    static void verificarSenha(String senha) {

        int cont = 0;
        String num[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String letraMinus[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String letraMaius[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String caracEspecial[] = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+"};

        for (String n : num) {
            if (senha.contains(n)) {    //para cada numero que houver em senha 
                cont++;                 // adiciona +1 ao contador
                break;
            }
        }

        for (String l : letraMinus) {   //para cada letra minuscula em senha
            if (senha.contains(l)) {    //adiciona +1 ao contador
                cont++;
                break;
            }
        }

        for (String u : letraMaius) {  //para cada letra maiuscula em senha
            if (senha.contains(u)) {    // adiciona +1 ao contador  
                cont++;
                break;
            }
        }

        for (String c : caracEspecial) {    //para cada caractere especial em senha
            if (senha.contains(c)) {        // adiciona +1 ao contador
                cont++;
                break;
            }
        }

        if (6 - senha.length() > 4 - cont) {        //se a senha for menor do que 6, mesmo atendendo aos requsitos
            System.out.println(6 - senha.length()); //print o numero de caracteres que faltam
        } else {                                    
            System.out.println(4 - cont);
        }
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite a senha: ");     //entrar com a senha
        String senha = tcl.nextLine();
        verificarSenha(senha);
        tcl.close();
    }
}
