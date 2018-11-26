package ru.stqa.java_qa.addressbook;

public class BookEntryCompanyInfo {
    private final String title;
    private final String company;
    private final String address;

    public BookEntryCompanyInfo(String title, String company, String address) {
        this.title = title;
        this.company = company;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }
}
