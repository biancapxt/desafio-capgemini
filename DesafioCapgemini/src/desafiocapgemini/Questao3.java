package desafiocapgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Questao3 {


public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String n = tcl.nextLine();
        List<String> lista = new ArrayList();
        int cont = 0;
        
        for (int i = 0; i < n.length(); i++) {
            for (int j = i + 1; j <= n.length(); j++) {
                lista.add(n.substring(i, j));
            }
        }

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);
        
        List<String> listaItensOrdenados = new ArrayList();
        for(String item : lista){
            String itemLista[] = item.split("");
            Arrays.sort(itemLista);
            
            String itemOrdenado = "";
            for(String item2 : itemLista){
                itemOrdenado += item2;
            }
            
            listaItensOrdenados.add(itemOrdenado);
        }

        System.out.println(listaItensOrdenados);
        
        for(String itemOrdenado : listaItensOrdenados){
            for(String item : listaItensOrdenados){
                if(item.length() == itemOrdenado.length()){
                    if(item.equals(itemOrdenado)){
                        cont++;
                    }
                }
            }
        }
        
        System.out.println(cont);
        
        //falta terminar
        
        /*
        for (int i = 0; i < listaItensOrdenados.size(); i++) {
            for (int j = i+1; j <= listaItensOrdenados.size(); j++) {
                if(lista.get(i).length() == listaItensOrdenados.get(j).length()){
                    if(lista.get(i).equals(listaItensOrdenados.get(j))){
                        cont++;
                    }
                }
            }
        }
        
        System.out.println(cont);
        */
    }    
}
