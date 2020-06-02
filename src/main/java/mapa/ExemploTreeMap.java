package mapa;

import javax.print.DocFlavor;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args){

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Monta a árvore com as capitais
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("MG", "Belo Horizonte");
        treeCapitais.put("ES", "Vitória");
        treeCapitais.put("CE", "Fortaleza");

        System.out.println(treeCapitais);

        //primeira capital do topo da árvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lowerKey("ES"));

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higherKey("ES"));

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstEntry().getKey() + " -- " + treeCapitais.firstEntry().getValue());

        //Retorna a ultima capital no topo da árvore
        System.out.println(treeCapitais.lastEntry().getKey() + " -- " + treeCapitais.lastEntry().getValue());


        System.out.println(treeCapitais.lowerEntry("MG").getKey() + " -- " + treeCapitais.lowerEntry("MG").getValue());

        System.out.println(treeCapitais.higherEntry("MG").getKey() + " -- " + treeCapitais.higherEntry("MG").getValue());

        Map.Entry<String, String> firstEntry =  treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry =  treeCapitais.pollLastEntry();

        //Retorna a primeira capital no topo da árvore removendo do Map
        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());

        //Retorna a primeira capital no final da árvore removendo do Map
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

        System.out.println(treeCapitais);

        //Navega em todos as chaves do Iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + "--" + treeCapitais.get(key));
          }
        for (String capital: treeCapitais.keySet()){
            System.out.println(capital + " -- " + treeCapitais.get(capital));
        }

        for (Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey() + " -- " + capital.getValue());
        }

    }
}
