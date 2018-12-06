package ru.stqa.java_qa.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.java_qa.addressbook.model.ContactDate;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().gotoContactPage();
    app.getContactHelper().initAddContact();
    app.getContactHelper().fillContactForm(new ContactDate("Java course","Soft QA","Moscow, Lenina 44","1@qa.ru","2@qa.ru", "3@qa.tu", "Ivan","Ivanov","Ivanovich","5555555","666666","777777", "test1"), true);
    app.getContactHelper().submitAddContact();
    app.getContactHelper().returnToContact();

  }

}
