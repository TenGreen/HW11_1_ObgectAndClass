package HW11_1_ObjectAndClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author ivanov = new Author("Иван", "Иванов");
        Author petrov = new Author("Пётр", "Петров");

        Book tom1 = new Book("Том первый", ivanov, 2020);
        Book tom2 = new Book("Том 2", petrov, 2021);

        PrintKatalog.printAuthorsHeading();
        PrintKatalog.printAuthors(ivanov);
        PrintKatalog.printAuthors(petrov);

        ChangeData.changeYearOfPublication(tom1);




    }
}

        /*
        Напишите конструкторы для обоих классов, заполняющие все поля.
        Создайте геттеры для всех полей автора и всех полей книги.
        Создайте сеттер для поля «Год публикации» у книги.
        В методе main создайте несколько объектов «Книга»
        (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух)
         и инициализируйте их. Учтите, что авторы являются обязательными
         и книги не могут создаваться без авторов.
         Метод main не должен находиться в классах Book и Author.

        Создайте отдельный класс для запуска приложения и объявите метод main в нем.

        В том же методе main измените год публикации одной из книг с помощью сеттера.
        Так как вы изучили геттеры и сеттеры, оставлять поля открытыми,
        без модификатора доступа private, недопустимо.

        Подсказка
        При вызове переменных с объектом в методе main сначала вызовите переменную Author,
        а уже после — переменную Book. Это нужно для того,
        чтобы при записи имени переменной Author в значение переменной Book не возникало ошибки.
         */


