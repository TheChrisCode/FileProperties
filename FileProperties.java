package FileProperties;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class FileProperties {

    public static void main(String[] args) throws FileNotFoundException {

        FileCreator.Create();
        FileReader.Read();



        File file = new File("testdocument.txt");


        Date date = new Date(file.lastModified());
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getPath());
            System.out.println("Absolute File Path: " + file.getAbsolutePath());
            System.out.println("Is The File Readable: " + file.canRead());
            System.out.println("Is The File Writable: " + file.canWrite());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("File Last Modified This Many Milliseconds After 1970: " + file.lastModified());
            System.out.println("File Actual Modified Date: " + date);
        }
        else {
            System.out.println("This file does not exist.");
        }

    }




}
