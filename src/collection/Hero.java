package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hero {
    private String name;
    public Hero (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static void main(String[] args){
        Hero h1 = new Hero("斉藤");
        Hero h2 = new Hero("鈴木");

        ArrayList<Hero> heros = new ArrayList<Hero>();

        heros.add(h1);
        heros.add(h2);
        for (Hero hero : heros){
            System.out.println(hero.getName());
        }

        Map<Hero, Integer> herosInfo = new HashMap<Hero, Integer>();

        herosInfo.put(h1,3);
        herosInfo.put(h2,7);

        for( Hero key : herosInfo.keySet()){
            int value = herosInfo.get(key);
            System.out.println(key.getName() + "が倒した数は = " + value);
        }

    }
}
