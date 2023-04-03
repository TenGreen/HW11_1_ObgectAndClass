package HW11_1_ObjectAndClass;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;

    public Book(String name, Author author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
       return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setAuthor(Author author) {
      this.author = author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Название: " + this.name + " Автор: " + author.toString() + " Год издания: " + this.yearOfPublication;
    }

    @Override
    public boolean equals(Object book2) {
        if (book2 == this) {
            return true;
        }
        if (book2 == null || book2.getClass() != this.getClass()) {
            return false;
        }
        Book guest = (Book) book2;
        return ((name != null && name.equals(guest.getName())) && (author != null && author.equals(guest.getAuthor()))
                && (yearOfPublication != 0 && yearOfPublication == guest.yearOfPublication));
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }


    /*Реализовать методы toString, equals и hashCode в классах Author и Book*/
}
