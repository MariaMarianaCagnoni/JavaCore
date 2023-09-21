package Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mariana
 * @Project: javacore
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> dicionario = new HashMap<>();
        dicionario.put("vc", "Você");
        dicionario.put("tecklado", "teclado");
        dicionario.put("u", "you");
        dicionario.putIfAbsent("u", "you2"); //só add caso nao exista

        for (String set : dicionario.keySet()) {
            System.out.println(set);
        }

        System.out.println("--------------------");
        for (String set : dicionario.values()) {
            System.out.println(set);
        }

        System.out.println("--------------");

        for(Map.Entry<String,String> entry: dicionario.entrySet()){
            System.out.println(entry); //pega chave e valor ao mesmo tempo.
        }
    }
}
