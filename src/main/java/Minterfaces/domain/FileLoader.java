package Minterfaces.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Loading data from file");
    }

    @Override
    public void  checkPermission(char permission) {

        System.out.println(permission == 's'? "Has permission":"Doesn't have permission");

    }

}
