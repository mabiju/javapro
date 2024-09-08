package ZA_File_IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k_file_character_stream {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/SCJPB5/ZA_File_IO/ram.txt");
        FileReader reader = new FileReader(file);
        char chars[] = new char[(int) file.length()];
        reader.read(chars);
        File out = new File("D:/SCJPB5/ZA_File_IO/copy_of_ram.txt");
        try (FileWriter writer = new FileWriter(out)) {
            writer.write(chars);
            writer.flush();
        }
        System.out.println("Data has been written successfully.");
        reader.close();
    }
}
