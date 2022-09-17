package entities;
import java.util.Iterator;


public class Iterador<T> implements Iterator {

    T[] itens;
    int posicao = 0;

    //Construtor Iterador
    public Iterador(T[] itens) {
        this.itens = itens;
    }

    //Verifica se ainda existe dado
    public boolean hasNext() {
        if (posicao < 0 || posicao >= itens.length) {
            return false;
        } else {
            return true;
        }
    }

    //Retorna o próximo valor
    public Object next() {
        Object item = itens[posicao];
        posicao++;
        return item;
    }

    public Object previous(){
        Object item = itens[(posicao-1)];
        return item;
    }
}
