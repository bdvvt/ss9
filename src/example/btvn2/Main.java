package example.btvn2;

public class Main {
    public static void main(String[] args) {
        Book bk1 = new Book("Java", "James", 100.0);
        Book bk2 = new Book("Python", "Guido", 120.0);
        Book bk3 = new Book("C++", "Bjarne", 150.0);
        Book[] books = {bk1, bk2, bk3};
        for (int i = 0; i < books.length; i++) {
            books[i].printInfo();
        }
    }
}
