import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leitor_csv {
    public static void main(String[] args) {
        String csvFile = "C://Users//52211545874//Desktop//leitor_excel//teste.csv";
        String line = "";
        String csvSeparator = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSeparator);
                for (String value : data) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}