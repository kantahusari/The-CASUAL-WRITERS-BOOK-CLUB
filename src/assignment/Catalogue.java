package assignment;
public class Catalogue {
private static Book[] blist;
private int maxBooks;
private int numBooks;
private int currentUnusedBookNo;
public Catalogue(int bookNoSeed,int maxBooks){
this.maxBooks=maxBooks;
currentUnusedBookNo=bookNoSeed;
blist=new Book[maxBooks];
}
//Find Book Option:
private int findBook(int bNum){
for (int i =0;i<numBooks;i++){
    if (blist[i].getBookNum() == bNum){
    return i;
    }
}
return -1;
}
//2. Delete Book Option:
public boolean deleteBook(int bNum){  // delete=true   no delete =false
int pos =findBook(bNum);
    if(pos==-1){
    return false;
    }
blist[pos]=blist[numBooks-1];
numBooks--;
return true;
}
//1. Add Book Option:
public boolean addBook(String title,String mainAuthor,String genre, int year){
if (numBooks<maxBooks){ //suc = true , fail=false
    if(findBook(currentUnusedBookNo)==-1){
        int bn=currentUnusedBookNo;   
        Book c= new Book(bn,title,mainAuthor,genre,year);
        blist[numBooks]=c;
        numBooks++;
        currentUnusedBookNo++;
        return true;
    }
}
return false;
}
//4. View Book Option:
public String viewBook(int bNum){
String s="";
for(int i=0;i<numBooks;i++){
    if (blist[i].getBookNum() == bNum) {
      s+="\n"+blist[i].toString();
    }
}
return s;
}
//3. View all Books Option:
public String getBookList(){
String s="\\\\ Welcome To Catalogue -----";
for(int i=0;i<numBooks;i++){
s+="\n"+blist[i].toString();
}
return s;
}
}

