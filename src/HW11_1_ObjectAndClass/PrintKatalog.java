package HW11_1_ObjectAndClass;

public class PrintKatalog {

    public static void printAuthorsHeading () {
        System.out.println("Авторы книг");
    }

    public static void printAuthors(Author author) {
        System.out.println("Фамилия "+ author.getLastNameAuthor() + ", имя " + author.getAuthorsName());
    }

    public static void printAll(Author author) {
        System.out.println(Author.class.toString());
    }

}
