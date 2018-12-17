package ru.stqa.java_qa.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.java_qa.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().gotoContactPage();
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().createContact(new ContactData("Java course","Soft QA","Moscow, Lenina 44","1@qa.ru","2@qa.ru", "3@qa.ru", "Ivan","Ivanov","Ivanovich","5555555","666666","777777", "test1"), true);
    app.getContactHelper().gotoContactPage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() + 1);
  }

}
