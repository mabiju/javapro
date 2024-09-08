package ZA_File_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class h_file_read_bufferedreader {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/SCJPB5/ZA_File_IO/ram.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
        br.close();
    }
}
