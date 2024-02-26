package DesignPattern.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Library lib1 = new Library();
        lib1.setLibname("Lib1");
        lib1.loadbooks();
        Library lib2 = lib1.clone();
        lib2.setLibname("Lib2");

        lib1.getBookList().remove(1);

        System.out.println(lib1);
        System.out.println(lib2);


//        for(Book book: lib1.getBookList()){
//            System.out.println(book.getName());
//        }

//        for(Book book: lib2.getBookList()){
//            System.out.println(book.getName());
//        }

    }
}
