package Xserializacao.domain;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author mariana
 * @Project: javacore
 */
public class Turma //implements Serializable
{
    @Serial
    //private static final long serialVersionUID = 6362575754258254161L;
    private String nome;

    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
