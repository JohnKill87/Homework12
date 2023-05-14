public class Author {
    private String authorName;
    private String authorLastName;

    public Author(String authorName, String authorLastName) {
        this.authorName = authorName;
        this.authorLastName = authorLastName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return authorName.equals((author.authorName) + authorLastName.equals(author.authorLastName));
    }
    public int hashCode() {
        return java.util.Objects.hash(authorName,authorLastName);
    }
    public String toString() {
        return "Имя - " + this.authorName + " Фамилия - " + this.authorLastName;
    }
}
