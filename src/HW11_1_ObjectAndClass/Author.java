package HW11_1_ObjectAndClass;

public class Author {
    private String authorsName;
    private String lastNameAuthor;

    public Author(String authorsName, String lastNameAuthor) {
        this.authorsName = authorsName;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getAuthorsName() {
        return this.authorsName;
    }

    public String getLastNameAuthor() {
        return this.lastNameAuthor;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public void setLastNameAuthor(String lastNameAuthor) {
        this.lastNameAuthor = lastNameAuthor;
    }

    @Override
    public String toString() {
        return "Фамилия " + getLastNameAuthor() + ", имя " + getAuthorsName();
    }

    @Override
    public boolean equals(Object autor2) {
        if (autor2 == this) {
            return true;
        }
        if (autor2 == null || autor2.getClass() != this.getClass()) {
            return false;
        }
        Author guest = (Author) autor2;
        return  (authorsName != null && authorsName.equals(guest.getAuthorsName()))
            || (lastNameAuthor != null && lastNameAuthor.equals(guest.getAuthorsName()));
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }


    /*Реализовать методы toString, equals и hashCode в классах Author и Book*/
}
