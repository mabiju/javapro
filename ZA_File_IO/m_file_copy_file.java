package ZA_File_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class m_file_copy_file {
    public static void copyFile() {
        try {
            FileInputStream fpin = new FileInputStream("D:/SCJPB5/ZA_File_IO/ram.txt");
            FileOutputStream fpout = new FileOutputStream("D:/SCJPB5/ZA_File_IO/copyram.txt");
            byte[] buffer = new byte[8192];
            int length = 0;
            while ((length = fpin.read(buffer, 0, buffer.length)) > 0) {
                fpout.write(buffer, 0, length);
            }
            fpout.flush();
            fpout.close();
            fpin.close();
        } catch (IOException x) {
            System.out.println("Error:" + x);
        }
    }

    public static void main(String[] args) {
        copyFile();
    }
}
