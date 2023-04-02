package HW11_1_ObjectAndClass;

public class Author {
    private String authorsName;
    private String lastNameAuthor;

    public Author(String authorsName, String lastNameAuthor) {
        this.authorsName = authorsName;
        this.lastNameAuthor = lastNameAuthor;
    }

    public String getAuthorsName () {
        return this.authorsName;
    }

    public String getLastNameAuthor() {
        return this.lastNameAuthor;
    }

    //public void setAuthorsName(String authorsName) {
    //    this.authorsName = authorsName;
    //}

    //public void setLastNameAuthor(String lastNameAuthor) {
    //    this.lastNameAuthor = lastNameAuthor;
    //}
}
