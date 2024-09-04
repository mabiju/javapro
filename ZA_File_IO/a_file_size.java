package ZA_File_IO;

import java.io.File;

public class a_file_size {
    public static void main(String[] args) {
        File file = new File("D:/SCJPB5/ZA_File_IO/ram.txt");
        long fileSize = file.length();
        // long filekb = fileLength/1024; // converting length in kilobytes
        System.out.println("The filesize = " + fileSize + " bytes");
    }
}
