package Z_Console_IO;

import java.io.*;

public class l_bufferedreader_string {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter your name:");
        String name = br.readLine();
        System.out.print("Your name is = ");
        System.out.print(name);
    }
}
