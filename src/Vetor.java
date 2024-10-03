import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalAlunos = 0;

    public void add(Aluno aluno) {
        this.alunos[totalAlunos] = aluno;
        this.totalAlunos++;
    }

    public void add(int posicao, Aluno aluno) {
        verifica(posicao);
        this.alunos[posicao] = aluno;
    }

    public Aluno pegar(int posicao){
        verifica(posicao);
        return alunos[posicao];
    }

    public void remover(int posicao){
        verifica(posicao);
        alunos[posicao] = null;
    }

    public boolean contem(Aluno aluno){
        for (Aluno pessoa : this.alunos){
            //sem o "pessoa != null" causa NullPointerException, ele tenta usar o .equals numa posição "null"
            if (pessoa!=null && pessoa.equals(aluno)){
                return true;
            } 
        }return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);

    }

    public boolean verifica(int posicao) {
        if (posicao >= 0 && posicao <= alunos.length - 1) {
            return true;
        } else {
            throw new IllegalArgumentException("Posição Invalida");
        }
    }
}
