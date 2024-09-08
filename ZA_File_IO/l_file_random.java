package ZA_File_IO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class l_file_random {
    static final String FILEPATH = "D:/SCJPB5/ZA_File_IO/ram.txt";

    public static void main(String[] args) {
        try {
            System.out.println(new String(readFromFile(FILEPATH, 0, 18)));
            writeToFile(FILEPATH, "Hello Sanothimi, how are you.", 31);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] readFromFile(String filePath, int position, int size) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void writeToFile(String filePath, String data, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}
