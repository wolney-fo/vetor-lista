package entities;
import java.util.*;


public class Vetor<T> {

    //Vetor Genérico
    private T[] vetor;

    //Variável que controla quantidade de elementos do vetor
    private int qntElementos = 0;

    //Construtor específico da Classe Vetor
    public Vetor(int tam) {

        //Criando um novo vetor genérico
        vetor = (T[]) new Object[tam];

        this.qntElementos = tam;

    }

    //Método que verifica se existe dado em uma posição do vetor
    public boolean existeDado(int pos) {
        return vetor[pos] != null;
    }

    //Método que retorna o valor de uma posição do vetor
    public T Recuperar(int pos) {
        if ((pos < 0 && pos > Tamanho()) || (!existeDado(pos))) {
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        }
        return vetor[pos];
    }

    //Método que verifica se o vetor está vazio
    public boolean vazio() {
        return Tamanho() == 0;
    }

    //Método que adiciona no vetor usando o recurso de Iterador
    public void AdicionarIt(T elemento) {

        if (Tamanho() == vetor.length) {
            redimensionar();
        }

        //Passamos o vetor como parâmetro para o iterador
        Iterador it = new Iterador(vetor);

        int i=0;
        while (it.hasNext()){ //percorrendo o vetor usando iterador

            if (it.next() == null) {
                vetor[i] =  elemento;
                qntElementos++;
                break;
            }
            i++;
        }
    }

    //Método que adiciona no vetor
    public void Adicionar (T elemento) {
        if (Tamanho() == vetor.length) {
            redimensionar();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = elemento;
                qntElementos++;
                break;
            }
        }
    }

    //Método que remove do vetor em uma determinada posição
    public void Remover(int posicao) throws ArrayIndexOutOfBoundsException {

    }

    //Método que remove do início do vetor
    public void RemoverInicio() {

    }

    //Método que remove do fim do vetor
    public void RemoverFim() {

    }


    //Método que retorna o tamanho atual do vetor
    public int Tamanho() {
        return qntElementos;
    }

    //Método que limpa/apaga todas as posições do vetor
    public void Limpar() {

    }

    //Método que dobra o tamanho do vetor caso ele atinja o seu tamanho.
    public void redimensionar(){

    }
}
