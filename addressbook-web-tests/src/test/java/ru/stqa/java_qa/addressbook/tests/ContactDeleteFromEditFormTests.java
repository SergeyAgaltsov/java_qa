package ru.stqa.java_qa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.java_qa.addressbook.model.ContactDate;

public class ContactDeleteFromEditFormTests extends TestBase {

    @Test
    public void testContactDeleteFromEditForm(){
        app.getContactHelper().gotoContactPage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().deleteContactFromEditForm();
    }
}
