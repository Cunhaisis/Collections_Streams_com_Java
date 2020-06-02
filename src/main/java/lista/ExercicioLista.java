package lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExercicioLista {

    public static void main(String[] args){

        List<String> filmes = new ArrayList<>();

        //Adiciona itens a lista
        filmes.add("O homem Invisivel");
        filmes.add("O ódio que você semeia");
        filmes.add("Vingadores EndGame");
        filmes.add("O lado Bom da Vida");
        filmes.add("Pantera Negra");
        filmes.add("Cred: Nascido para Lutar");
        filmes.add("Liga da Justiça");

        //Navega pela lista usando o for
        for(String filme: filmes){
            System.out.println(filmes);
        }
        //Substitui o nome do 2° item
        filmes.set(2, "Avengers EndGame");
        System.out.println(filmes);

        //Retorna o item da posição 1
        int posicao = filmes.indexOf("O ódio que você semeia");
        System.out.println(posicao);

        //Remove o item da posição 4
        filmes.remove(4);
        System.out.println(filmes);

        // Remove o item Liga da Justiça
        filmes.remove("Liga da Justiça");
        System.out.println(filmes);

        //Retorna a quantidade de itens na lista
         int quantidade =  filmes.size();
         System.out.println(quantidade);

        //Verifica se o item esta na lista
        boolean temOfilme = filmes.contains("O homem Invisivel");
        System.out.println(temOfilme);

        //Ordena em Ordem alfabética
        Collections.sort(filmes);
        System.out.println(filmes);

        // Verifica se esta a lista está vazia
        boolean estavazia = filmes.isEmpty();
        System.out.println(estavazia);





    }


}
