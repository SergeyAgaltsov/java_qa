package ru.stqa.java_qa.addressbook.model;

public class ContactData {
    private final String title;
    private final String company;
    private final String address;
    private final String email;
    private final String email2;
    private final String email3;
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String home;
    private final String work;
    private final String mobile;
    private String group;

    public ContactData(String title, String company, String address, String email, String email2, String email3, String firstname, String middlename, String lastname, String home, String work, String mobile, String group) {
        this.title = title;
        this.company = company;
        this.address = address;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.home = home;
        this.work = work;
        this.mobile = mobile;
        this.group = group;
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

    public String getEmail() {
        return email;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
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

    public String getGroup() {
        return group;
    }
}
