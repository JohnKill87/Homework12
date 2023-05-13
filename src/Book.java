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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book bookName = (Book) other;
        return bookName.equals(bookName.bookName);
    }
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
    public String toString() {
        return "Название книги - " + this.bookName + " Автор - " + this.author + " Год публикации - " + this.age;
    }
}
