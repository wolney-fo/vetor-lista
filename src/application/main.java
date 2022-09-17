package application;
import entities.Vector;
import entities.Aluno;

public class main  {
    public static void main(String[] args){
        Vector<Aluno> vetor = new Vector<Aluno>(2);

        Aluno a = new Aluno("ANA", 30);
        Aluno a2 = new Aluno("MARIA", 35);

        vetor.adicionar(a, 0);
        vetor.adicionar(a2, 1);

        //imprimindo os dados do aluno
        System.out.println("Nome: "  + vetor.recupera(0).getNome());
        System.out.println("Idade: " + vetor.recupera(0).getIdade());
        System.out.println("Nome: "  + vetor.recupera(1).getNome());
        System.out.println("Idade: " + vetor.recupera(1).getIdade());
    }
}
