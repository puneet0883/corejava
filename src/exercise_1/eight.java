package exercise_1;

public class eight {
    public static void main(String[] args) {
        String str = "tothenew";

        StringBuilder str1 = new StringBuilder();

        str1.append(str);

        str1 = str1.reverse();

        System.out.println(str1);

        str1.delete(4,9);

        System.out.println("String after deleting some character : " +str1);
    }


}
