package Decorator;
import java.io.File;  
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Decorator {

    public static void main(String[] args) {
        lue();
    }
    
    private static void lue() {
        try {
            File database = new File("Decorator/data.txt");
            Scanner myReader = new Scanner(database);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
