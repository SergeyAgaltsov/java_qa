package ru.stqa.java_qa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.java_qa.addressbook.model.ContactDate;

public class ContactDeleteFromEditFormTests extends TestBase {

    @Test
    public void testContactDeleteFromEditForm(){
        app.getContactHelper().gotoContactPage();
        if (! app.getContactHelper().isThereContact()){
            app.getContactHelper().createContact(new ContactDate("Java course","Soft QA","Moscow, Lenina 44","1@qa.ru","2@qa.ru", "3@qa.tu", "Ivan","Ivanov","Ivanovich","5555555","666666","777777", "test1"), true);
        }
        app.getContactHelper().gotoContactPage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().deleteContactFromEditForm();
    }
}
