package generics;

import java.security.Key;

public class StrongBox<E> {
    private E data;
    private KeyType keyType;
    private long count;

    public void put(E data){this.data = data;}
    // public E get(){ return this.data;}

    StrongBox(KeyType keyType){
        this.keyType = keyType;
    }

    public E get(){
        this.count++;
        switch(this.keyType){
            case PADLOCK:
                if (this.count < 1024){
                    return null;
                }
                break;
            case BUTTON :
                if (this.count < 10000){
                    return null;
                }
                break;
            case DIAL :
                if (this.count < 30000){
                    return null;
                }
                break;
            case FINGER :
                if (this.count < 1000000){
                    return null;
                }
                break;
        }
        this.count = 0;
        return this.data;

    }
}
