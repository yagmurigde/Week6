import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {int total =0;

        //Dosyayı oluşturalım.
        File patika = new File("patika.txt");
        try {
            patika.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileReader number = new FileReader(patika);
            BufferedReader input = new BufferedReader(number);
            String line;
            while ((line= input.readLine()) !=null ) {
                System.out.println (Integer.parseInt(line));
                total+=Integer.parseInt(line);
            }
            System.out.println("total:" + total);
        } catch (Exception e) {System.out.println(e.getMessage());
        }
    }
}