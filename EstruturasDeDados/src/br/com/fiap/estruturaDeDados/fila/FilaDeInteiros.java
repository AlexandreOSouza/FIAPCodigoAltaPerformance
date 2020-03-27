package br.com.fiap.estruturaDeDados.fila;

import java.util.Scanner;

public class FilaDeInteiros {

    // Definiçao do NO da FILA
    private static class NO {
        public int dado;
        public NO prox;
    }

    // Definiçao dos ponteiros ini e fim
    private static NO ini;
    private static NO fim;

    private static class Retorno {
        public int item;
        public boolean ok;
    }

    public void INIT() {
        ini = null;
        fim = null;
    }

    public boolean IsEmpty() {
        return (ini == null && fim == null);
    }

    public void ENQUEUE(int item) {
        NO novo = new NO();
        novo.dado = item;
        novo.prox = null;
        if(IsEmpty()) {
            ini = novo;
        } else {
            fim.prox = novo;
        }
        fim = novo;
    }

    public Retorno DEQUEUE() {
        Retorno saida = new Retorno();
        if(!IsEmpty()) {
            saida.item = ini.dado;
            ini = ini.prox;
            if(ini == null) {
              fim = null;
            }
            saida.ok = true;
        } else {
            saida.ok = false;
        }
        return saida;
    }


    public static void main(String[] args) {
        // Instanciando o objeto fila
        FilaDeInteiros fila = new FilaDeInteiros();
        Retorno resultado = new Retorno();

        Scanner in = new Scanner(System.in);

        int item, opcao;

        fila.INIT();

        // Repeticao para inserir elementos na FILA

        do {
            System.out.println("Digite um dado inteiro: ");
            item = in.nextInt();
            fila.ENQUEUE(item);
            System.out.println("Digite 0 para encerrar a inserçao de dados ");
            opcao = in.nextInt();
        } while(opcao != 0);

        // repetir elemento da FILA ate que esta fique vazia
        do {
            resultado = fila.DEQUEUE();
            if (resultado.ok) {
                System.out.println("Dado retirado: " + resultado.item);
            }
        } while(resultado.ok);
        in.close();
    }
}
