package ru.stqa.java_qa.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeleteFromMainFormTests extends TestBase {

    @Test
    public void testContactDeleteFromMainForm(){
        app.getContactHelper().gotoContactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContactFromMainForm();
        app.getContactHelper().acceptContactDelete();
    }
}

