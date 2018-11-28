package ru.stqa.java_qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.java_qa.addressbook.model.ContactDate;

public class ContactHelper extends HelperBase {


    public ContactHelper(FirefoxDriver wd) {

        super(wd);
    }

    public void initAddContact() {

        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactDate contactDate) {
        type(By.name("firstname"),contactDate.getFirstname());
        type(By.name("middlename"),contactDate.getMiddlename());
        type(By.name("lastname"),contactDate.getLastname());
        type(By.name("title"),contactDate.getTitle());
        type(By.name("company"),contactDate.getCompany());
        type(By.name("address"),contactDate.getAddress());
        type(By.name("home"),contactDate.getHome());
        type(By.name("work"),contactDate.getWork());
        type(By.name("mobile"),contactDate.getMobile());
        type(By.name("email"),contactDate.getEmail());
        type(By.name("email2"),contactDate.getEmail2());
        type(By.name("email3"),contactDate.getEmail3());
    }

    public void gotoContact() {
        click(By.id("content"));
    }

    public void submitAddContact() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }



}


