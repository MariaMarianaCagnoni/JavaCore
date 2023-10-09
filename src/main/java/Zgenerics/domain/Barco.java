package Zgenerics.domain;

import org.jetbrains.annotations.NotNull;

/**
 * @author mariana
 * @Project: javacore
 */
public class Barco {
    private String nome;

    public Barco(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome do barco não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
