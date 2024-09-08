package ZA_File_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class e_file_read_scanner {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:/SCJPB5/ZA_File_IO/ram.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
