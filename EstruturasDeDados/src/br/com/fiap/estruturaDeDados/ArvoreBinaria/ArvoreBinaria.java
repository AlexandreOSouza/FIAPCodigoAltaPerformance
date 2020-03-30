package br.com.fiap.estruturaDeDados.ArvoreBinaria;

public class ArvoreBinaria {

    private static class ARVORE {
        public int dado;
        public ARVORE dir;
        public ARVORE esq;
    }

    public static ARVORE init() {
        return null;
    }

    public static ARVORE inserir(ARVORE p, int info) {
        // p -> NO Raiz
        // insere elemento na arvore
        if (p == null) {
            p = new ARVORE();
            p.dado = info;
            p.dir = null;
            p.esq = null;
        } else if (info < p.dado) {
            p.esq = inserir(p.esq, info);
        } else {
            p.dir = inserir(p.dir, info);
        }
        return p;
    }

    public static ARVORE removeValor(ARVORE p, int info) {
        if (p != null) {
            if (info == p.dado) {
                if (p.esq == null && p.dir == null) {
                    // Remove o no folha
                    return null;
                }

                if (p.esq == null) {
                    // se nao ha subarvore esquerda o ponteiro passa a
                    // apontar para a subarvore direita
                    return p.dir;
                } else {
                    if (p.dir == null) {
                        // se nao ha subarvore direita o ponteiro passa a
                        // apontar para a subarvore da esquerda
                        return p.esq;
                    } else {
                        // O no a ser removido possui subarvores a esquerda e a direita, entao o
                        // no deve-se encontrar o menor valor na subarvore a direita
                        ARVORE aux, ref;
                        ref = p.dir;
                        aux = p.dir;
                        while (aux.esq != null) {
                            aux = aux.esq;
                        }
                        aux.esq = p.esq;
                        return ref;
                    }
                }
            }
        } else {
            if (info < p.dado) {
                p.esq = removeValor(p.esq, info);
            } else {
                p.dir = removeValor(p.dir, info);
            }
        }
        return p;
    }

}
