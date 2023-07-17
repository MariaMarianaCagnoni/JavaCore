package Minterfaces.test;

import Minterfaces.domain.DataLoader;
import Minterfaces.domain.DatabaseLoader;
import Minterfaces.domain.FileLoader;

/**
 * @author mariana
 * @Project: javacore
 */
public class InterfaceTest01 {
    public static void main(String[] args) {


        DatabaseLoader dataLoader = new DatabaseLoader();
        dataLoader.load();
        dataLoader.checkPermission('s');
        FileLoader fileLoader = new FileLoader();
        System.out.println(fileLoader);




    }

}

