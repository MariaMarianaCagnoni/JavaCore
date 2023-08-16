package Vio.test;

import java.io.File;
import java.io.IOException;

/**
 * @author mariana
 * @Project: javacore
 */
public class FileTest02 {

    public static void main(String[] args) throws IOException {
        //criando diretorios

        File fileDiretorio = new File("folder");
        boolean isFileDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isFileDiretorioCreated);

        File newDiretorio = new File(fileDiretorio, "arquivofilho.txt");
        boolean isFileCreated = newDiretorio.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File("arquivo_renomeado.txt");
        boolean isFileRenamed = fileRenamed.renameTo(fileRenamed);
        System.out.println(isFileRenamed);
    }
}
