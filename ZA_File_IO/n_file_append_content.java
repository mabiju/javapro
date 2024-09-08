package ZA_File_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class n_file_append_content {
    public static void main(String[] args) {
        try {
            // Create file
            FileWriter fstream = new FileWriter("D:/SCJPB5/ZA_File_IO/ram.txt", true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(" Kathmandu is the capital city of Nepal.");
            // Close the output stream
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }
}
