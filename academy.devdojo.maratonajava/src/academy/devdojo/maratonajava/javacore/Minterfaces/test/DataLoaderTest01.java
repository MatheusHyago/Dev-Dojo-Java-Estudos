package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.model.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.model.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.model.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {


        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        fileLoader.remove();

        System.out.println("-----------------------------------");

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();

    }

}
