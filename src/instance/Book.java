package instance;
import java.util.*;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date pulishDate;
    private String comment;

    public void setTitle(String title){ this.title = title;}
    public String getTitle(){ return this.title; }

    public void setPulishDate(Date pulishDate ){ this.pulishDate = pulishDate; }
    public Date getPulishDate(){ return this.pulishDate; }

    public void setComment(String comment ){ this.comment = comment; }
    public String getComment(){ return this.comment; }


    public boolean equals(Object o){
        if (o == null){
            return false;
        }

        if (o == this){
            return true;
        }

        if (!(o instanceof Book)){
            return false;
        }

        Book b = (Book)o;
        if (!this.getTitle().trim().equals(b.getTitle().trim())){
            return false;
        }

        if (!this.getPulishDate().equals(b.getPulishDate())){
            return false;
        }
        return true;
    }

    public int hashCode(){
        int result = 30;
        result = result * 35 + this.getTitle().hashCode();
        result = result * 35 + this.pulishDate.hashCode();
        return result;
    }


    public int compareTo(Book obj){
        return this.pulishDate.compareTo(obj.pulishDate);
    }

    public Book clone(){
        Book b = new Book();
        b.title = this.title;
        b.comment = this.comment;
        b.pulishDate = (Date) this.pulishDate.clone();
        return b;
    }



}
