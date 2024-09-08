package ZA_File_IO;

/* import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader; */
import java.io.*;

public class d_file_create_write {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the file name to create : ");
        String file_name = in.readLine();
        File file = new File(file_name);
        boolean exist = file.createNewFile();
        if (!exist) {
            System.out.println("File already exists.");
            System.exit(0);
        } else {
            FileWriter fstream = new FileWriter(file_name);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(in.readLine());
            out.close();
            System.out.println("File created or date written successfully.");
        }
    }
}
