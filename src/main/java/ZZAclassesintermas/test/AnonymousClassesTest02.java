package ZZAclassesintermas.test;

import Zgenerics.domain.Barco;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */
public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> listaDeBarcos = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        listaDeBarcos.sort(new Comparator<>() {
            //pode dar new em uma interface se for em classes anônimas
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(listaDeBarcos);
    }
}