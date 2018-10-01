import java.io.*;

public class FileinputstreamDemo {
    public static void main(String[] args) throws IOException {

        String path = "/tmp/abc/user.csv";
       /* FileOutputStream stream= new FileOutputStream(path);

        String name = "sanjeev";                         // for output stream same for input stream

        stream.write(name.getBytes());
        stream.flush();
        stream.close();*/


       FileInputStream inputStream = new FileInputStream(path);

       int i=0;
       while ((i=inputStream.read())!=-1){
           System.out.println((char)i);
       }

    }
}
