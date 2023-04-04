package HW11_1_ObjectAndClass;

import java.util.Objects;

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
        return "Author{" +
                "authorsName='" + authorsName + '\'' +
                ", lastNameAuthor='" + lastNameAuthor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(authorsName, author.authorsName) && Objects.equals(lastNameAuthor, author.lastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorsName, lastNameAuthor);
    }
}
