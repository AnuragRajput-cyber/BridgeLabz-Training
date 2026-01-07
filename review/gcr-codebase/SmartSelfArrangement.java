package reviews;

import java.util.ArrayList;

class Sort{
    public void sortBooks(ArrayList<Book> list){
        for(int i=1;i<list.size();i++){
            Book book=list.get(i);
            int j=i-1;

            while(j>=0 && list.get(j).title.compareToIgnoreCase(book.title)>0){
                list.set(j+1,list.get(j));
                j--;
            }
            list.set(j+1,book);
        }
    }
}

class Book{
    String title;
    int publishedYear;
    Book(String title,int publishedYear){
        this.title=title;
        this.publishedYear=publishedYear;
    }
}

class User{
    String name;
    int id;
    ArrayList<Book> readingList=new ArrayList<>();
    Sort sorting=new Sort();

    User(String name,int id){
        this.name=name;
        this.id=id;
    }

    public void addBook(Book book){
        readingList.add(book);
        System.out.println(name+" Added title:"+book.title);
        sorting.sortBooks(readingList);
        
    }
}

public class SmartSelfArrangement{
    public static void main(String[] args){
        Book b1=new Book("Hassard",2025);
        Book b2=new Book("Apple",2025);
        Book b3=new Book("Ball",2025);

        User u1=new User("Anurag",101);
        u1.addBook(b1);
        u1.addBook(b2);
        u1.addBook(b3);

        System.out.print("Reading List--> ");
        for(Book i:u1.readingList){
            System.out.print(i.title +"("+i.publishedYear+"), ");
        }
    }
}
