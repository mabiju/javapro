package ZB_File_Open;

import java.io.File;
import java.io.FileInputStream;

public class b_file_open_fileinputstream {
    public static void main(String[] args) {
        try {
            //constructor of file class having file as argument  
            File file = new File("D:/SCJPB5/ZB_File_Open/sanothimi.txt");   
            FileInputStream fis = new FileInputStream(file);    //opens a connection to an actual file
            System.out.println("Contents in the file:");

            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char)i);  //prints the content of the file  
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
