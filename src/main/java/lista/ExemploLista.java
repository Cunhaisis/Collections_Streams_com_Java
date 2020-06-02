package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploLista {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Jake");
        nomes.add("Amy");
        nomes.add("Diaz");
        nomes.add("Terry");
        nomes.add("Raymond");
        nomes.add("Charles");

        System.out.println(nomes);

        Collections.sort(nomes);

        //nomes.set(5, "Hitcock");

        System.out.println(nomes);

        String nome = nomes.get(2);

        System.out.println(nome);

        int tamanho =  nomes.size();

        System.out.println(tamanho);

        boolean temAmy = nomes.contains("Amy");

        System.out.println(temAmy);

        boolean estaVazia = nomes.isEmpty();

        System.out.println(estaVazia);

        int posicao = nomes.indexOf("Jake");

        System.out.println(posicao);

        for (String nomeDoItem: nomes){  //Navegando pelo array com for
            System.out.println("--->" + nomeDoItem);
        }

        /* Iterator<String> interator = nomes.iterator(); // Percorrendo com Interator

        while (interator.hasNext()){
            System.out.println(interator.hasNext());
        } */

    }

    
}
