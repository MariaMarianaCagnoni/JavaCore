package ZZDoptional.test;

import java.util.List;
import java.util.Optional;

/**
 * @author mariana
 * @Project: javacore
 */
public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Teste");
        System.out.println(o1);
        Optional<Object> o = Optional.ofNullable(null);
        System.out.println(o);
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
            empty.ifPresent(s -> System.out.println("presente"));
        //Optional<String> teste2 = Optional.of(null);
        //  System.out.println(teste2); nullpointerException

        Optional<String> findByNameResponse = Optional.ofNullable(findByName("Mariana"));
        String naoExisteEsseNome = findByNameResponse.orElse("Não existe esse nome");

        System.out.println(naoExisteEsseNome);

    }

    private static String findByName(String name) {
        List<String> list = List.of("Mariana", "Luzia");
        int i = list.indexOf(name);
        if (i != -1) {
            return list.get(i);
        }
        return null;
    }
    //não usar Optional como variavel de classe ou como passagem de parametro em um método,sso pq o Optional não é serializavel.

}