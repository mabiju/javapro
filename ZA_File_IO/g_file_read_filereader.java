package ZA_File_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class g_file_read_filereader {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fr = null;
        try {
            fr = new FileReader("D:/SCJPB5/ZA_File_IO/ram.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File bhetiyana hai hajur.");
        }
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
