import java.io.*;
import java.util.*;

public class UpdateMarks {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Students.csv"));
            String line;

            list.add(br.readLine()); // header

            Random r = new Random();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                data[6] = String.valueOf(60 + r.nextInt(40));
                data[7] = String.valueOf(60 + r.nextInt(40));

                list.add(String.join(",", data));
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("Students.csv"));
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }

            bw.close();
            System.out.println("Marks updated.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
