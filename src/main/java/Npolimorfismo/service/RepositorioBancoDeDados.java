package Npolimorfismo.service;

import Npolimorfismo.repositorio.Repositorio;

/**
 * @author mariana
 * @Project: javacore
 */
public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }
}
