import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Tester {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("file.txt");
            int data = reader.read();

            while (data != -1 )
                System.out.print((char)data);
            data = reader.read();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
