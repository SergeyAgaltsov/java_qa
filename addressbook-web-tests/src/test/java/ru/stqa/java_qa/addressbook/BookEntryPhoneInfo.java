package ru.stqa.java_qa.addressbook;

public class BookEntryPhoneInfo {
    private final String home;
    private final String work;
    private final String mobile;

    public BookEntryPhoneInfo(String home, String work, String mobile) {
        this.home = home;
        this.work = work;
        this.mobile = mobile;
    }

    public String getHome() {
        return home;
    }

    public String getWork() {
        return work;
    }

    public String getMobile() {
        return mobile;
    }
}
