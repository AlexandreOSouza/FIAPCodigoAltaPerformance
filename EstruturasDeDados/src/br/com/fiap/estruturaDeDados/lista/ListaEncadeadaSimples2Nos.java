package br.com.fiap.estruturaDeDados.lista;

public class ListaEncadeadaSimples2Nos {

    private static class NO {
        public int dado;
        public NO prox;
    }

    public static void main(String [] args) {
        // Criando e inicializando a lista
        NO lista = null;
        System.out.println("Valor ponteiro lista = " + lista);

        // Adicionando dois nos as listas
        for(int i = 1; i <= 2; i++) {
           NO novo = new NO();
           novo.dado = i + 4;
           novo.prox = lista;
           lista = novo;
        }

        // Apresentando de forma estatica os valores
        System.out.println("Dado do NO apontado por lista = " + lista.dado);
        System.out.println("Dado do NO apontado por prox " + lista.prox.dado);

        NO aux = lista;
        while(aux != null) {
            System.out.println("Dado do NO apontado por prox: " + aux.dado);
            aux = aux.prox;
        }

    }

}
