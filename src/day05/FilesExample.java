package day05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesExample {

    File file = new File(Constants.PEOPLE_FILE_PATH);
    File fileToCreate = new File(Constants.GENERAL_FILE_PATH  + "participants.txt");

    void createFile(){
        System.out.println("canRead " + file.canRead());
        System.out.println("canWrite " + file.canWrite());
        System.out.println("getName " + file.getName());
        System.out.println("getAbsolutePath " + file.getAbsolutePath());
        System.out.println("length " + file.length());
        try {
            fileToCreate.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    void writeToFile(){
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Selamlar ben mehmet nasilsin?");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    void readFile(){
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println("data: " + data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    void deleteFile(){
        if (fileToCreate.delete()){
            System.out.println("dosya silindi");
        } else {
            System.out.println("Dosya silinemedi");
        }
    }
}
