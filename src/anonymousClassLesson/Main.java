package anonymousClassLesson;

import generics.Pocket;

public class Main {
    public static void main(String[] args){
        Pocket<Object> pocket = new Pocket<Object>();
        System.out.println("Make a disposable instanse and put it in pocket");
        pocket.put(new Object() {
            String innerField;
            void innerMethod(){
                System.out.println("inner Method");
            }
        })
    }
}
