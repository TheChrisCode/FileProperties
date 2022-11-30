package FileProperties;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void Read() {
        try {
            File file = new File("testdocument.txt");
            Scanner fileFinder = new Scanner(file);
            System.out.println("Data in File:");
            while (fileFinder.hasNextLine()) {
                String data = fileFinder.nextLine();
                System.out.println(data);
            }
            System.out.println("End of Data.");
            System.out.println(" ");
            System.out.println(" ");

            fileFinder.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


}
