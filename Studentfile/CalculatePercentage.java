import java.io.*;
import java.util.*;

public class CalculatePercentage {

    public static double calc(int m1, int m2, int m3, int m4, int m5) {
        return (m1 + m2 + m3 + m4 + m5) / 5.0;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Students.csv"));
            String line;

            list.add(br.readLine()); // header

            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");

                int m1 = Integer.parseInt(d[3]);
                int m2 = Integer.parseInt(d[4]);
                int m3 = Integer.parseInt(d[5]);
                int m4 = Integer.parseInt(d[6]);
                int m5 = Integer.parseInt(d[7]);

                double per = calc(m1, m2, m3, m4, m5);
                d[8] = String.format("%.2f", per);

                list.add(String.join(",", d));
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("Students.csv"));
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }

            bw.close();
            System.out.println("Percentage updated.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
