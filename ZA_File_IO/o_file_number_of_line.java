package ZA_File_IO;

import java.io.*;

public class o_file_number_of_line {
    public static void main(String[] args) {
        String filePath = "D:/SCJPB5/ZA_File_IO/ram.txt"; // file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Number of lines in the file: " + lineCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}