/*
Student Name:Kanta Husari
Student Number:101217294
*/
package assignment;
import java.util.*;
public class Assignment {
static void menum(){
        System.out.println("\n"+"////"+" Welcome to CASUAL WRITERS BOOK CLUB Catalogue "+"////"+"\n"
                + "1. Add Book.\n"
                + "2. Delete Book.\n"
                + "3. View all Books.\n"
                + "4. View book Details.\n"
                + "5. Exit.");
}
static void menu(){
        System.out.println("\n"
                + "1. Add Book.\n"
                + "2. Delete Book.\n"
                + "3. View all Books.\n"
                + "4. View book Details.\n"
                + "5. Exit.");
}
static void choice_warning(){
    System.out.print("Please Enter A Valid Option 1 - 5: ");
}
static void ask(){
    System.out.print("Please Enter An Option: ");
}
    public static void main(String[] args) {
//-----------This is the Stage----------
Scanner sc = new Scanner(System.in);
/*
-->Stage Design ---
Welcome to the CASUAL WRITERS BOOK CLUB
1.Add Book
2.Delete Book
3.View all Books
4.View book Details
5.Exit
_________________________
-->Functionality --- 
1.Add Book ---> 
A.  system should ask for: 
    title, main author, genre and year.
B.  A message indicating whether the book was successfully 
    added or not must be displayed before returning 
    to the main menu.
2.Delete Book ---> 
A.  Display all books currently in the system
B.  The user should then be prompted for a bookNumber to delete.
C.  A message indicating whether the book was successfully 
    deleted or not must be displayed before returning to the main menu.
3.View all Books --->
A.  system should display all books currently in the system
4.View book Details --->
A.  the system should ask the user for a bookNumber
B.  An appropriate message should be shown if it was not found.    
5.Exit
*/      
/*
Initialization
*/
        boolean test;
        int bos,mn;
        System.out.println("CASUAL WRITERS BOOK CLUB START ");
        System.out.print("Please Enter the Book Number Seed: ");
        bos=sc.nextInt();
        System.out.print("Please Enter the Maximum Number of Books: ");
        mn=sc.nextInt();
        Catalogue cc=new Catalogue(bos,mn);
        //System Ready....
        int c;
        menum();
        ask();
        c=sc.nextInt();
        if (c<=0 ||c>5) {
            choice_warning();
        }
        while(c!=5){
            if (c == 1)
            {
                String title,mainAuthor,genre;
                int year;
                System.out.print("Please Enter Title: ");
                title=sc.next();
                System.out.print("Please Enter Main Author: ");
                mainAuthor=sc.next();
                System.out.print("Please Enter Genre: ");
                genre=sc.next();
                System.out.print("Please Enter Year: ");
                year=sc.nextInt();
                test=cc.addBook(title, mainAuthor, genre, year);
                    if (test) {
                System.out.println("Adding Book Successful ..");        
                    }else{
                        System.out.println("Catalogue is Full You can't Add More Books ..");
                    }
            }
            if (c == 2)
            {
                int bn;
                System.out.println(cc.getBookList());
                System.out.print("Choose A Book to Delete: ");
                bn=sc.nextInt();
                test=cc.deleteBook(bn);
                if (test) {
                    System.out.println("Deleting Was Successfull...");
                }else{
                System.out.println("Deleting Failed ... ");
                }
            }
            if (c == 3)
            {
                System.out.println(cc.getBookList());
            }
            if (c == 4)
            {
                int bn;
                System.out.print("Enter a Book Number To View Details: ");
                bn=sc.nextInt();
                cc.viewBook(bn);
                if (cc.viewBook(bn)=="") {
                    System.out.println("Book Is Not In The Catlogue..");
                }else{
                    System.out.println("Found Match:");
                    System.out.println(cc.viewBook(bn));
                }
            }
            System.out.println();
            menu();
            ask();
            c=sc.nextInt();
            if (c<=0 ||c>5) {
            choice_warning();
            }
        }
        System.out.println("Thank You For Using ABC Solutions Software...");
//--------
    }
}