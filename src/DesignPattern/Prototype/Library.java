package DesignPattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Library implements Cloneable {

    List<Book> bookList = new ArrayList<>();
    String libname;

    public String getLibname() {
        return libname;
    }

    public void setLibname(String libname) {
        this.libname = libname;
    }

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Library() {
    }


    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + bookList +
                ", libname='" + libname + '\'' +
                '}';
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    void loadbooks(){
        for(int i =1;i<=10;i++){
            Book book = new Book();
            book.setName("Book" + i);
            bookList.add(book);
        }
    }

    @Override
    protected Library clone() throws CloneNotSupportedException {
        Library lib = new Library();
        for(Book b : this.getBookList()){
            lib.getBookList().add(b);
        }
        return lib;

    }

}
