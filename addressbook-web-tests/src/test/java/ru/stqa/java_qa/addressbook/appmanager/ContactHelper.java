package ru.stqa.java_qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.java_qa.addressbook.model.ContactData;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {

        super(wd);
    }

    public void initAddContact() {

        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHome());
        type(By.name("work"), contactData.getWork());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("email"), contactData.getEmail());
        type(By.name("email2"), contactData.getEmail2());
        type(By.name("email3"), contactData.getEmail3());

        if (creation){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }

    public void returnToContact() {
        click(By.id("content"));
    }

    public void gotoContactPage() {
        click(By.linkText("home"));
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

    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
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

    public void createContact(ContactData contact, boolean creation) {
        initAddContact();
        fillContactForm(contact,true);
        submitAddContact();
        returnToContact();
    }

    public boolean isThereContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.name("selected[]"));
        for (WebElement element : elements) {
            String name = element.getText();
            ContactData contact = new ContactData(null,null,null,null,null,null,null,null,null,null,null,null,null);
            contacts.add(contact);
        }
        return contacts;
    }
}


