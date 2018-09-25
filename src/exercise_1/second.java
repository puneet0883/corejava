package exercise_1;

public class second {
    public static void main(String[] args) {
        String input = "Welcome to Java Java Java Session Session Session Session";
        String[] words = input.split(" ");
        int wrc = 1;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) //Inner loop for Comparison
            {

                if (words[i].equals(words[j])) //Checking for both strings are equal
                {
                    wrc = wrc + 1; //if equal increment the count
                    words[j] = "0"; //Replace repeated words by zero
                }
            }
            if (words[i] != "0")
                System.out.println(words[i] + "--" + wrc);
            wrc = 1;


        }

    }
}
