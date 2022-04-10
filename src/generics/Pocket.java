package generics;

// public class Pocket {
//     private Object data;
//     public void put(Object d){ this.data = d; }
//     public Object get(){return this.data; }
// }

public class Pocket<E>{
    private E data;
    public void put( E d ){ this.data = d; }
    public E get(){ return this.data;}
}