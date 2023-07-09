package Gassociacao.test;

import Gassociacao.domain.Jogador;

/**
 * @author mariana
 * @Project: javacore
 */
public class JogadorTest01 {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Messi");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador:jogadores) {
            System.out.print(jogador.getNome()   + " " );

        }
    }
}
