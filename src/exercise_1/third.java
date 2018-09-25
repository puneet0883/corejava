package exercise_1;

public class third {

    public static void main(String[] args) {
        String str = "this is an example of character";

        System.out.print("find occurance of a in given string");

        System.out.println("length of sting with a : " + str.length());
        System.out.println("length of string without a : " + str.replace("a","").length());
          int count = str.length() -str.replace("a","").length();
        System.out.println("number of occurance of a is : " + count);

    }
}
