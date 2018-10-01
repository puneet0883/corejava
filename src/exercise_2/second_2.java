package exercise_2;

public class second_2
{

    public static void main(String[] args)
    {

        String str = "tothenew";

        char temp = 0;

        char arr[] = str.toCharArray();

        for(int i=0;i< arr.length;i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[j] > arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            for(int k=0;k<arr.length;k++)
            {
                System.out.println(arr[k]);
            }

    }
}
