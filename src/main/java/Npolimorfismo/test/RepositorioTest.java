package Npolimorfismo.test;

import Npolimorfismo.repositorio.Repositorio;
import Npolimorfismo.service.RepositorioArquivo;
import Npolimorfismo.service.RepositorioBancoDeDados;
import Npolimorfismo.service.RepositorioMemoria;

/**
 * @author mariana
 * @Project: javacore
 */
public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        repositorio = new RepositorioArquivo();
        repositorio.salvar();

        repositorio = new RepositorioMemoria();
        repositorio.salvar();

        //programão orientada a interfaces


    }
}
