import com.sun.org.apache.xerces.internal.xs.StringList;

import java.lang.reflect.Array;
import java.util.*;

public class Demooffunctionprog {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,5,1,2,5,3);
        Collections.sort(integerList, ( o1, o2) -> o2-o1);
        System.out.println(integerList);

        Collections.sort(integerList, ( o1, o2) -> o1-o2);

        System.out.println(integerList);

        List<String> stringList = Arrays.asList("puneet","shubham","naman","shreya");

        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1 , String o2){
                return  o1.compareTo(o2);
            }

        });
        System.out.println(stringList);


    }
}
