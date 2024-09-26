// we need to create a file before running this program.
package ZB_File_Open;

import java.io.File;
import java.awt.Desktop;

public class a_file_open_desktop {
    public static void main(String[] args) {
        try {
            //constructor of file class having file as argument  
            File file = new File("D:/SCJPB5/ZB_File_Open/sanothimi.txt"); //check if Desktop is supported by Platform or not
            if (!Desktop.isDesktopSupported()) {
                System.out.println("This file cannot be opened.");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists()) {    //checks file exists or not
                desktop.open(file); //opens the specified file  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
