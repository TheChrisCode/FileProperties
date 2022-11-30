import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetFileContent {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Christia.Phillips\\Documents\\Java Game\\FileProperties\\testdocument.txt");
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String fileData = fileReader.nextLine();
                if (fileData.equals("beatsJames")) {
                    System.out.println("did beat James");
                }
                System.out.println(fileData);
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
