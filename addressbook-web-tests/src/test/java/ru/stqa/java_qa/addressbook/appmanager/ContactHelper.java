package ru.stqa.java_qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.java_qa.addressbook.model.ContactDate;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {

        super(wd);
    }

    public void initAddContact() {

        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactDate contactDate, boolean creation) {
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

        if (creation){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactDate.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }

    public void gotoContact() {
        click(By.id("content"));
    }

    public void submitAddContact() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }


    public void initContactModification() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitContactModification() {
        click(By.xpath("//input[@value='Update']"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteContactFromEditForm() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void deleteContactFromMainForm() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void acceptContactDelete(){
        wd.switchTo().alert().accept();
    }
}


