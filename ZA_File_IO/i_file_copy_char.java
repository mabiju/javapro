package ZA_File_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class i_file_copy_char {
    public static void main(String[] args) throws IOException {
        // existing file
        File file = new File("D:/SCJPB5/ZA_File_IO/ram.txt");
        FileInputStream fis = new FileInputStream(file);
        byte bytes[] = new byte[(int) file.length()];
        // Reading data from the file
        fis.read(bytes);
        // Writing data to another file
        File out = new File("D:/SCJPB5/ZA_File_IO/ram2.txt");
        try (FileOutputStream outputStream = new FileOutputStream(out)) {
            // Writing data to the file
            outputStream.write(bytes);
            outputStream.flush();
        }
        System.out.println("Data successfully written in the specified file");
        fis.close();
    }
}
