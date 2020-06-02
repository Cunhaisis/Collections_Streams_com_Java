package mapa;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String [] args){
        Map<String , Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil",5);
        campeoesMundialFifa.put("Alemanha",4);
        campeoesMundialFifa.put("Itália",4);
        campeoesMundialFifa.put("Uruguai",2);
        campeoesMundialFifa.put("Argentina",2);
        campeoesMundialFifa.put("França",3);
        campeoesMundialFifa.put("Inglatera",1);
        campeoesMundialFifa.put("Espanha",1);

        System.out.println(campeoesMundialFifa);

        //Atualiza o valor para a chave
        campeoesMundialFifa.put("Brasil", 6);

        System.out.println(campeoesMundialFifa);

        //Retorna um item especifico
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna se existe ou não
        System.out.println(campeoesMundialFifa.containsKey("Espanha"));

        //Remove do Map
        campeoesMundialFifa.remove("Uruguai");

        //Retorna s existe ou não
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Retorna o tamnho do map
        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);

        //Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry: campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        for (String key: campeoesMundialFifa.keySet()){
            System.out.println(key + "--" + campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        //Verifica se tem o valor Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        //Verifica se tem o valor Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa);

        campeoesMundialFifa.size();
    }

}
