import java.io.*;
public class BufferedOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(
        new FileOutputStream("/tmp/abc/user.csv"));

        bufferedOutputStream.write("puneet".getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

        BufferedInputStream bufferedInputStream=new BufferedInputStream(
                new FileInputStream("/tmp/abc/user.csv"));

        int i=0;
        while ((i=bufferedInputStream.read())!=-1){
            System.out.println((char)i);
        }
        bufferedInputStream.close();
    }
}
