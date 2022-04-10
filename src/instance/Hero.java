package instance;

import java.util.ArrayList;
import java.util.List;

public class Hero implements Cloneable {
    public String name;
    private int hp, mp;
    Sword sword;

    public Hero(String name){
        this.name = name;
    }

    public Hero(){}

    public void setSword(Sword s){
        this.sword = s;
    }

    public Sword getSword(){
        return this.sword;
    }

    public String toString(){
        return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
    }

    public int hashCode() {
        int result = 37;
        result = result * 31 + this.name.hashCode();
        result = result * 31 + hp;
        return result;

    }

    public Hero clone() {
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword;
        return result;

    }

    public static void test1(){
        List<Hero> list = new ArrayList<Hero>();
        Hero h1 = new Hero();
        h1.name = "Minato";
        list.add(h1);
        System.out.println("要素数=" + list.size());
        h1 = new Hero();
        h1.name = "Minato";
        list.remove(h1);
        System.out.println("要素数=" + list.size());
    }

    public static void test2(){
        Hero h1 = new Hero("minato");
        Sword s =  new Sword("Metal Sword");
        h1.setSword(s);
        System.out.println("装備：" + h1.getSword().getName());
        System.out.print("clone()で複製します");
        Hero h2 = h1.clone();
        System.out.println("コピー元の勇者の剣の名前を変えます");
        h1.getSword().setName("Hinoki Sword");
        System.out.println("display the equipment of the hero of the copy sorce and copy destination");
        System.out.println("copy source : " + h1.getSword().getName() + "/copy destination : " +  h2.getSword().getName());

    }

    public static void main(String[] args){
        Hero.test2();
    }


}
