
package assignment;
public class Book {
private int bookNumber;
private String title;
private String mainAuthor;
private String genre;
private int year;
public Book(String title, String mainAuthor, String genre,int year){
        this.title=title;
        this.mainAuthor=mainAuthor;
        this.genre=genre;
        this.year=year;
}
public Book(int bn, String title, String author, String gener, int year){
        this.bookNumber=bn;
        this.title=title;
        this.mainAuthor=author;
        this.genre=gener;
        this.year=year;
}
public int getBookNum(){
return bookNumber;
}
public String getTitle(){
return title;
}
public String getAuthor(){
return mainAuthor;
}
public String getGenre(){
return genre;
}
public int getYear(){
return year;
}
public String toString(){
String s=
        "Book Number: "+getBookNum()+"\n"
        +"Title: "+getTitle()+"\n"
        +"Author: "+getAuthor()+"\n"
        +"Genere: "+getGenre()+"\n"
        +"Year: "+getYear()+"\n";
return s;
//-------------------
}
}
