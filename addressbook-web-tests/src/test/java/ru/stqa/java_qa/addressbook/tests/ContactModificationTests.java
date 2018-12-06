package ru.stqa.java_qa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.java_qa.addressbook.model.ContactDate;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        app.getContactHelper().gotoContactPage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactDate("Java course 2","Soft QA 2","Moscow, Lenina 4444","11@qa.ru","22@qa.ru", "33@qa.tu", "Ivan2","Ivanov2","Ivanovich2","55555552","6666662","7777772", null), false);
        app.getContactHelper().submitContactModification();
    }
}
