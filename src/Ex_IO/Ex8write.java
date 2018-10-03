package Ex_IO;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex8write {

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("/tmp/employee/puneet1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new
                    BufferedOutputStream(fileOutputStream);
            byte[] bytes = new byte[2935];
            bufferedOutputStream.write("Writing data to a file".getBytes());
            bufferedOutputStream.write("using BufferedOutputStream".getBytes());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


