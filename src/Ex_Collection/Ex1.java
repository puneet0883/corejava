package Ex_Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex1 {

        public static void main(String[] args)
        {

            List<Float> list = new ArrayList<>();
            list.add(3.15f);
            list.add(4.15f);
            list.add(5.05f);
            list.add(6.05f);
            list.add(7.00f);


            Iterator<Float> iterator = list.iterator();

            while (iterator.hasNext()) {
                float i = (float) iterator.next();
                System.out.print(i + ", ");
            }
            System.out.println("\n" + list);
            Iterator<Float> itr = list.iterator();
            {
                int sum = 0;
                for (float i: list) {
                    sum += i;
                }
                System.out.println(sum);
            }

        }
    }

