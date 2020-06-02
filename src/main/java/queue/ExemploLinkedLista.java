package queue;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedLista {
    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Chris");
        filaBanco.add("Drew");
        filaBanco.add("Rochele");
        filaBanco.add("Golpe Baixo");
        filaBanco.add("Julius");
        filaBanco.add("Tonya");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        //filaBanco.clear();

        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        for (String cliente: filaBanco){
            System.out.println(cliente);
        }
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext());
        System.out.println(iteratorFilaBanco.hasNext());

        filaBanco.add("Sr Omar");
        System.out.println(filaBanco);


    }
}
