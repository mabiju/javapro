package ZB_File_Open;

import java.io.*;

public class d_file_open_filereader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:/SCJPB5/ZB_File_Open/sanothimi.txt");
            System.out.println("Content is:");

            int i = 0;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i); //prints the content of the file   
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
