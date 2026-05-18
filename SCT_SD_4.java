import java.io.FileWriter;
import java.io.IOException;

public class SCT_SD_4
{

    public static void main(String[] args) {

        String[][] products = {
                {"Laptop", "55000", "4.5"},
                {"Smartphone", "25000", "4.2"},
                {"Headphones", "3000", "4.0"},
                {"Smart Watch", "5000", "4.3"}
        };

        String fileName = "products.csv";

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.append("Product Name,Price,Rating\n");

            for (String[] product : products) {
                writer.append(product[0]).append(",");
                writer.append(product[1]).append(",");
                writer.append(product[2]).append("\n");
            }

            writer.flush();
            writer.close();

            System.out.println("Product data stored successfully in " + fileName);

        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }
}