package exercise_1;

public class forth {

    public static void main(String[] args) {

        String str = "wiAAMODom@@$$*&123332cnMSxn$";

        char arr[] = str.toCharArray();

        int len = str.length();
        int num = 0;
        int upch =0;
        int loch = 0;
        int spch = 0;
         int i;
        for (i=0;i<len;i++)
        {
            if(Character.isUpperCase(arr[i]))
            {
                upch++;
            }
            else if(Character.isLowerCase(arr[i]))
            {
                loch++;
            }
            else if (Character.isDigit(arr[i]))
            {
                num++;
            }
            else
            {
                spch++;
            }
        }

        double upchPercentage = (upch * 100.0) / len ;

        double lochPercentage = (loch * 100.0) /len;

        double numPercentage = (num * 100.0) /len;

        double spchPercentage = (spch * 100.0) / len;

        System.out.println("% of lower char : " + lochPercentage);
        System.out.println("% of upper char : " + upchPercentage);
        System.out.println("% of digits : " + numPercentage);
        System.out.println("% of special char : " + spchPercentage);



    }
}
