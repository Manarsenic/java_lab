import java.io.*;

public class DisplayStudents {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("Students.csv"));
            String line;

            // Skip header
            br.readLine();

            System.out.println("Student Details\n");

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");

                System.out.println("Student ID: " + d[0]);
                System.out.println("Name: " + d[1]);
                System.out.println("Branch: " + d[2]);

                System.out.println("Marks:");
                System.out.println("  Subject 1: " + d[3]);
                System.out.println("  Subject 2: " + d[4]);
                System.out.println("  Subject 3: " + d[5]);
                System.out.println("  Subject 4: " + d[6]);
                System.out.println("  Subject 5: " + d[7]);

                System.out.println("Percentage: " + d[8]);

                System.out.println("-----------------------------");
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
