package ru.stqa.java_qa.addressbook;

public class BookEntryEmailsInfo {
    private final String email;
    private final String email1;
    private final String email2;

    public BookEntryEmailsInfo(String email, String email1, String email2) {
        this.email = email;
        this.email1 = email1;
        this.email2 = email2;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail1() {
        return email1;
    }

    public String getEmail2() {
        return email2;
    }
}
