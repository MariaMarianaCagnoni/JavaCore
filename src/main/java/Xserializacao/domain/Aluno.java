package Xserializacao.domain;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author mariana
 * @Project: javacore
 */
public class Aluno implements Serializable {

    @Serial
    private static final long serialVersionUID = 2L;
    private Long id;
    private String nome;
    private transient String password;
    //este campo vai ser ignorado na serialização

    private static final String NOME_DA_FACULDADE = "UNIP";
    //atributos estáticos não são serializados, pois pertecem a classe e não ao objeto

    private transient Turma turma;

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_DA_FACULDADE='" + NOME_DA_FACULDADE + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }
}
