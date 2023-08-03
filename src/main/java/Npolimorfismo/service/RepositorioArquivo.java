package Npolimorfismo.service;

import Npolimorfismo.repositorio.Repositorio;

/**
 * @author mariana
 * @Project: javacore
 */
public class RepositorioArquivo implements Repositorio {


    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
