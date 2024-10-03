import java.util.Objects;

public class Aluno{
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno param_aluno = (Aluno)obj;
        return Objects.equals(this.nome, param_aluno.nome);
    }

}