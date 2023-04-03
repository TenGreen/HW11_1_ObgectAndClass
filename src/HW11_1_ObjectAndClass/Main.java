package HW11_1_ObjectAndClass;

public class Main {
    public static void main(String[] args) {
        Author ivanov = new Author("Иван", "Иванов");
        Author petrov = new Author("Пётр", "Петров");

        Book tom1 = new Book("Том первый", ivanov, 2020);
        Book tom2 = new Book("Том 2", petrov, 2021);

        //PrintKatalog.printAuthorsHeading();
        //PrintKatalog.printAuthors(ivanov);
        //PrintKatalog.printAuthors(petrov);
        System.out.println(ivanov);
        System.out.println(tom1);


        //ChangeData.changeYearOfPublication(tom1);

    }
}

