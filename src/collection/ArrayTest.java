package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTest {
    public static void test(){
        String[] names = new String[3];

        names[0] = "aaa";
        names[1] = "bbb";
        names[2] = "ccc";
    
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("ddd");
        names2.add("eee");
        names2.add("fff");

        for(int i = 0; i < names2.size(); i++){
            System.out.println(names2.get(i));
        }

        Iterator<String> it = names2.iterator();

        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
    }
}
