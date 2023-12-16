package ru.mirea.task2.nomer1;

public class Author {
    private final String authorName;
    private String authorEmail;
    private final char authorGender;

    public Author(String name, String email, char gender) {
        this.authorName = name;
        this.authorEmail = email;
        this.authorGender = gender;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public char getAuthorGender() {
        return authorGender;
    }

    public void setAuthorEmail(String email) {
        this.authorEmail = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorEmail='" + authorEmail + '\'' +
                ", authorGender=" + authorGender +
                '}';
    }
}

class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Aleksandr", "Aleksandr@gmail.com", 'm');
        System.out.println(a1);
        a1.setAuthorEmail("Aleksandr@gmail.ru");
        System.out.println(a1);
        System.out.println("name: " + a1.getAuthorName() + ", email: "
                + a1.getAuthorEmail() + ", gender: " + a1.getAuthorGender());
    }
}
