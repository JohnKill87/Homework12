public class Main {
    public static void printSeparator() {
        System.out.println("====================");
    }
    public static void main(String[] args) {
        Author yunKoga = new Author("Юн", "Кога");
        System.out.println("Имя автора - " + yunKoga.getAuthorName());
        System.out.println("Фамилия автора -  " + yunKoga.getAuthorLastName());
        printSeparator();
        Author levTolstoy = new Author("Лев", "Толстой");
        System.out.println("Имя автора - " + levTolstoy.getAuthorName());
        System.out.println("Фамилия автора - " + levTolstoy.getAuthorLastName());
        printSeparator();
        Book devilsRiddle = new Book("Загадка дьявола",yunKoga, 2013);
        System.out.println("Название книги - " + devilsRiddle.getBookName());
        System.out.println("Автор - " + yunKoga.getAuthorName() + " " + yunKoga.getAuthorLastName());
        System.out.println("Год публикации - " + devilsRiddle.getAge());
        printSeparator();
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1867);
        System.out.println("Название книги - " + warAndPeace.getBookName());
        System.out.println("Автор - " + levTolstoy.getAuthorName() + " " + levTolstoy.getAuthorLastName());
        System.out.println("Год публикации - " + warAndPeace.getAge());
        printSeparator();
        warAndPeace.setAge(1865);
        System.out.println("Год публикации - " + warAndPeace.getAge());
    }
}