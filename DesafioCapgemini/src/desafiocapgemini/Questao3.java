package desafiocapgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Questao3 {

    static boolean verificarAnagrama(String s1, String s2) {
        char[] vetor1 = s1.toCharArray();  //cada string é transformada em um array
        char[] vetor2 = s2.toCharArray();

        Arrays.sort(vetor1);                //ordenar os caracteres dos arrays
        Arrays.sort(vetor2);

        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (vetor1[i] != vetor2[i]) // checar se as substrings sao diferentes
                {
                    return false;           //caso sejam diferentes, retornar falso
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static int anagrama(String n) {
        int cont = 0;
        for (int i = 1; i < n.length(); i++) {
            List<String> lista = new ArrayList<>();  //lista para armazenar as substrings
            for (int j = 0; j <= n.length(); j++) {
                if (i + j <= n.length()) {
                    lista.add(n.substring(j, i + j));  // armazenando as substrings na lista
                }
            }
            for (int k = 0; k < lista.size(); k++) {
                for (int m = k + 1; m < lista.size(); m++) {
                    if (verificarAnagrama(lista.get(k), lista.get(m))) {  //verificar se substrings são anagramas
                        cont++;                 //se sim, acrescenta +1 ao contador
                    }
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite uma palavra: "); //entrar com a palavra
        String n = tcl.next();                      // palavra armazenada na variavel n
        System.out.println(anagrama(n));
        tcl.close();
    }
}
