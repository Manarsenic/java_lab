import java.io.FileWriter;
import java.io.IOException;

public class AddStudents {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Students.csv", true);

            writer.append("3,Stefan,EXTC,60,65,70,0,0,0\n");
            writer.append("4,Caroline,CS,88,92,85,0,0,0\n");
            writer.append("5,Klaus,IT,55,60,58,0,0,0\n");

            writer.close();
            System.out.println("3 new students added.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
