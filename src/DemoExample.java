import java.io.*;
public class DemoExample {

    public static void main(String[] args) {

        try {
            File file = new File("/tmp/");       //specifying the pathname where we want to create

            file.createNewFile();       //file method generate io exception

        }catch (IOException exc){
            exc.printStackTrace(System.out);
        }

    }
}
