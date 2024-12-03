package javacore.Exercicio.dominio;

public class Seminario {
    private String titulo;

    private Aluno[] alunos;
    private  String Local;
    private Endereco endereco;

    public Seminario(String titulo, Aluno[] alunos, Endereco endereco ) {
        this.titulo = titulo;
        this.alunos = alunos;
       this.endereco = endereco;
    }

    public Seminario(String titulo, Aluno[] alunos, String local, Endereco endereco) {
        this.titulo = titulo;
        this.alunos = alunos;
         this.Local = local;
        this.endereco = endereco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
