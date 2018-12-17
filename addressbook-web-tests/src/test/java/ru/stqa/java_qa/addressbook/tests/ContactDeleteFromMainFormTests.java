package ru.stqa.java_qa.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.java_qa.addressbook.model.ContactData;

import java.util.List;

public class ContactDeleteFromMainFormTests extends TestBase {

    @Test
    public void testContactDeleteFromMainForm(){
        app.getContactHelper().gotoContactPage();
        if (! app.getContactHelper().isThereContact()){
            app.getContactHelper().createContact(new ContactData("Java course","Soft QA","Moscow, Lenina 44","1@qa.ru","2@qa.ru", "3@qa.tu", "Ivan","Ivanov","Ivanovich","5555555","666666","777777", "test1"), true);
        }
        app.getContactHelper().gotoContactPage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().deleteContactFromMainForm();
        app.getContactHelper().acceptContactDelete();
        app.getContactHelper().gotoContactPage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(),before.size() - 1);
    }
}

