package br.com.fiap.estruturaDeDados.pilha;

import java.util.Scanner;

public class PilhaDeInteiros {

    // definiçao do NO
    private static class NO {
        public int dado;
        public NO prox;
    }

    // Definiçao do retorno dos metodos POP e TOP
    private static class Retorno {
         public int item;
         public boolean ok;
    }

    // Definiçao do ponteiro topo da pilha
    private static NO topo;

    public void INIT() {
        topo = null;
    }

    public boolean IsEmpty() {
        return topo == null;
    }

    public void PUSH(int item) {
        NO novo = new NO();
        novo.dado = item;
        novo.prox = topo;
        topo = novo;
    }

    public Retorno POP() {
        Retorno saida = new Retorno();
        if(!IsEmpty()) {
            saida.item = topo.dado;
            topo = topo.prox;
            saida.ok = true;
        } else {
            saida.ok = false;
        }
        return saida;
    }

    public Retorno TOP() {
        Retorno saida = new Retorno();
        if(!IsEmpty()) {
            saida.item = topo.dado;
            saida.ok = true;
        } else {
            saida.ok = false;
        }
        return saida;
    }

    // Metodo main que exemplifica a utilizacao das operaçoes sobre pilha
    public static void main(String[] args) {

        PilhaDeInteiros s = new PilhaDeInteiros();
        Scanner in = new Scanner(System.in);

        int item;
        int opcao;

        Retorno res = new Retorno();

        // inicia a pilha fazendo topo = null
        s.INIT();

        // invoca metodo TOP para obter dado do no do topo da pilha
        res = s.TOP();
        if(res.ok) {
            System.out.println("Execuçao do TOP: " + res.item);
        } else {
            System.out.println("Execuçao do TOP: pilha VAZIA");
        }

        // Repetiçao para inserir elementos na pilha
        do {
            System.out.println("Digite o valor inteiro para o dado: ");
            item = in.nextInt();
            s.PUSH(item);
            System.out.println("Digite 0 para encerrar o empilhamento ");
            opcao = in.nextInt();
        } while(opcao != 0);

        // Invoca o metodo TOP para obter o dado do no do topo da pilha
        res = s.TOP();

        if(res.ok) {
            System.out.println("Execuçao do TOP: " + res.item);
        }

        do {
            res = s.POP();
            if(res.ok) {
                System.out.println("Dado retirado: " + res.item);
            }
        } while(res.ok);
        in.close();
    }


}
