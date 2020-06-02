package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedSet {

    public static void main (String[] args){
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adicona os numeros no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(9);
        sequenciaNumerica.add(22);
        sequenciaNumerica.add(18);

        System.out.println(sequenciaNumerica);

        //Remove o número do set
        sequenciaNumerica.remove(18);

        System.out.println(sequenciaNumerica);

        //Retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        //Navega em todos os intens do set
        Iterator<Integer> interator = sequenciaNumerica.iterator();

        while (interator.hasNext()){
            System.out.println(interator.hasNext());
        }
        for (Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }
       //Retorna se o set está vázio ou não
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
