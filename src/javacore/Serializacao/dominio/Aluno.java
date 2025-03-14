package javacore.Serializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {


    @Serial
    private static final long serialVersionUID = -1886247962795097576L;
    private Long id;
    private String nome;
    private transient String password;
    private transient Turma turma;
    private static String nomeEscola = "Alyson Viradao no Java";

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
        System.out.println("Dentro do Construtor");
    }

    private void WriteObjetect(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private void readObect(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", passoword='" + password + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
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
        return password;
    }

    public void setPassoword(String passoword) {
        this.password = passoword;
    }
}
