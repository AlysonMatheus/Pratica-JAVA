package javacore.Serializacao.dominio;

import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {
@Serial

private Long id;
   private String nome;
   private transient String passoword;

    public Aluno(Long id, String nome, String passoword) {
        this.id = id;
        this.nome = nome;
        this.passoword = passoword;
        System.out.println("Dentro do Construtor");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", passoword='" + passoword + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }
}
