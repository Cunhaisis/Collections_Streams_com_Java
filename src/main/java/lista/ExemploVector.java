package lista;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main (String[] args){

        List<String> series = new Vector<>();

        //Adiciona 4 series ao Vector
        series.add("Brooklin 99");
        series.add("Todo Mundo Odeia o Chris");
        series.add("The Office");
        series.add("Dexter");


        System.out.println(series);

        //Altera o valor da posição 2 do vetor
        series.set(2, "Friends");

        //Remove a series da posição 2
        series.remove(2);

        //Retorna o primeiro item do vetor
        System.out.println(series.get(0));

        //Navega nas series
        for(String serie: series){
            System.out.println(series);
        }


    }
}
