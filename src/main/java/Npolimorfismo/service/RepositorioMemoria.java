package Npolimorfismo.service;

import Npolimorfismo.repositorio.Repositorio;

/**
 * @author mariana
 * @Project: javacore
 */
public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
