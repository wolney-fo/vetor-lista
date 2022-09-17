package entities;


import java.util.Arrays;

public class Vector<T> {
    private int tam;
    private T[] vetor;
    private T[] vetorClone;

    public Vector(){}

    public Vector(int tam) {
        this.setTam(0);
        this.vetor = (T[]) new Object[tam];
        this.vetorClone = (T[]) new Object[tam];
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public T[] getVetor() {
        return vetor;
    }

    public void setVetor(T[] vetor) {
        this.vetor = vetor;
    }

    //-----Manipulação do vetor-----//
    public void adicionar(T elemento, int posicao){
        if (posicao >= vetor.length ){
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        }
        else{
        this.vetor[posicao] = elemento;
        this.vetorClone[posicao] = elemento;
        }
    }

    public void adicionarFim(T elemento){
        this.vetor[tamanho()-1] = elemento;
        setTam(getTam() + 1);
    }

    public void remove(int index){
        this.vetor[index] = null;
    }

    public void removeFim(){
        this.vetor[getVetor().length-1] = null;
    }

    public void limpa(){
        for (int i=0; i<getVetor().length; i++){
            this.vetor[i] = null;
        }
    }

    public void redimensiona(){

    }

    //-----Consultas-----//
    public boolean vazio() {
        return tamanho() == 0;
    }

    public boolean existeDado(int posicao) {
        return vetor[posicao] != null;
    }

    public int tamanho(){
        return this.getTam();
    }

    public T recupera(int index){
        if (index > this.vetor.length){
            throw new ArrayIndexOutOfBoundsException("Posição Inválida");
        }else{
        return this.vetor[index];
        }
    }

    public String showVetor(){
        return Arrays.toString(getVetor());
    }
}
