package ZB_File_Open;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class c_file_open_bufferedreader {
    public static void main(String[] args) {
        try {
            //constructor of file class having file as argument  
            File file = new File("D:/SCJPB5/ZB_File_Open/sanothimi.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));   //creates a buffer reader input stream 
            System.out.println("Contents are:");

            int i = 0;
            while ((i = br.read()) != -1) {
                System.out.print((char) i); //prints the content of the file   
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
