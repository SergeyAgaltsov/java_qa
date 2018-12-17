package ru.stqa.java_qa.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.java_qa.addressbook.model.ContactData;

import java.util.List;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        app.getContactHelper().gotoContactPage();
        if (! app.getContactHelper().isThereContact()){
            app.getContactHelper().createContact(new ContactData("Java course","Soft QA","Moscow, Lenina 44","1@qa.ru","2@qa.ru", "3@qa.ru", "Ivan","Ivanov","Ivanovich","5555555","666666","777777", "test1"), true);
        }
        app.getContactHelper().gotoContactPage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Java course 2","Soft QA 2","Moscow, Lenina 4444","11@qa.ru","22@qa.ru", "33@qa.ru", "Ivan2","Ivanov2","Ivanovich2","55555552","6666662","7777772", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().gotoContactPage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(),before.size() );
    }
}
