package ZB_File_Open;

import java.io.File;
import java.util.Scanner;

public class e_file_open_scanner {
    public static void main(String[] args) {
        try {
            //constructor of file class having file as argument  
            File file = new File("D:/SCJPB5/ZB_File_Open/sanothimi.txt");
            Scanner sc = new Scanner(file); //file to be scanned  
            System.out.println("Content is:");
            while (sc.hasNextLine()) {      //returns true if and only if scanner has another token
                System.out.println(sc.nextLine());  //prints the content of the file   
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
