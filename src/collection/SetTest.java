package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void test(){
        Set<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");

        System.out.println(colors.size());

        for( String s : colors){
            System.out.println(s);
        }

        Set<String> words = new TreeSet<String>();
        words.add("cat");
        words.add("dog");
        words.add("wolf");
        words.add("panda");

        for ( String s : words){
            System.out.println(s);
        }
    }
}
