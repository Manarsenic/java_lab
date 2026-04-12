import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("WrongFile.csv");
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }
    }
}
