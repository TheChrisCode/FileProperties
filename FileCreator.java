package FileProperties;

import java.io.File;
import java.io.IOException;

public class FileCreator {

    public static void Create() {

        try {
            File file = new File("testdocument.txt");
            if (file.createNewFile()) {
                System.out.println("File created.");
            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }


    }
}
