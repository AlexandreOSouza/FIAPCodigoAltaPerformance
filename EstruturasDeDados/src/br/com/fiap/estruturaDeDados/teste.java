package br.com.fiap.estruturaDeDados;

public class teste {

    private static class NO {

        public int dado;

        public NO prox;

    }



    public static void main(String[] args) {



        NO p = null;



        NO aux1 = new NO();

        aux1.dado= 1;

        aux1.prox = p;

        p = aux1;



        NO aux2 = new NO();

        aux2.dado= 3;

        aux2.prox = p;

        p = aux2;



        NO aux3 = new NO();

        aux3.dado= 5;

        aux3.prox = aux1;

        p.prox = aux3;



    }


}
