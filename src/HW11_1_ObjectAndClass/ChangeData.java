package HW11_1_ObjectAndClass;
import java.util.Scanner;

public class ChangeData {
    public static void changeYearOfPublication(Book book) {
        Scanner scanner = new Scanner(System.in);
        int newYearOfPublication;
        /*
        Book book;
        System.out.println("Данные какой книги хотите изменить?");
        book= scanner.nextBook();
        Не разобрался, как можно сканером считывать данные самим созданного типа данных.
        Потом как-нибудь, видимо, научимся.
         */
        System.out.println("Введите новый год публикации");
        newYearOfPublication = scanner.nextInt();
        book.setYearOfPublication(newYearOfPublication);
        System.out.println("Новый год публикации: " + book.getYearOfPublication());
        scanner.close();
    }
}
