package br.com.fiap.estruturaDeDados.lista;

public class ListaEncadeadaSimples {

    // Declaraçao do no e dos atributos
    private static class NO {
        public int dado;
        public NO prox;
    }

    public static void main(String [] args) {
        // Inicia lista vazia atribuindo null ao ponteiro lista
        NO lista = null;
        System.out.println("Valor ponteiro lista = " + lista);

        NO novo = new NO();
        novo.dado = 5;
        novo.prox = lista;
        lista = novo;

        System.out.println("Atributos do no apontado por lista = " + lista.dado + " " + lista.prox);
    }

}
