public class Book {
    private String bookName;
    private Author author;
    private int age;

    public Book(String bookName, Author author, int age) {
        this.bookName = bookName;
        this.author = author;
        this.age = age;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
