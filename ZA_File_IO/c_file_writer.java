package ZA_File_IO;

import java.io.FileWriter;
import java.io.IOException;

public class c_file_writer {
    public static void main(String[] args) throws IOException {
        String str = "Good morning Students, how are you ?";
        FileWriter fw = new FileWriter("D:/SCJPB5/ZA_File_IO/ram.txt");

        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        System.out.println("Data has been updated.");
        fw.close();
    }
}
