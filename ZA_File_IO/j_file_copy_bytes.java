package ZA_File_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class j_file_copy_bytes {
    public static void main(String[] args) throws IOException {
        // Creating FileInputStream object
        // first of all you need to create a new file name "sita.txt" and put some content
        File file = new File("D:/SCJPB5/ZA_File_IO/sita.txt");
        FileInputStream fis = new FileInputStream(file);
        byte bytes[] = new byte[(int) file.length()];
        // Reading data from the file
        fis.read(bytes);
        // Writing data to another file
        File out = new File("D:/SCJPB5/ZA_File_IO/copy_of_sita.txt");
        try (FileOutputStream outputStream = new FileOutputStream(out)) {
            // Writing data to the file
            outputStream.write(bytes);
            outputStream.flush();
        }
        System.out.println("Data successfully written in the specified file");
        fis.close();
    }
}
