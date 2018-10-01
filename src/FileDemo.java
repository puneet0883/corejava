import java.io.File;
import java.io.IOException;


public class FileDemo {
    public static void main(String[] args) {

        try {
            File file = new File("pathname");       //specifying the pathname where we want to create

            file.createNewFile();       //file method generate io exception

        }catch (IOException exc){
            exc.printStackTrace(System.out);
        }


    }



}
