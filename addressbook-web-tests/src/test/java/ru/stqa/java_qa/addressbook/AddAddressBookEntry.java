package ru.stqa.java_qa.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddAddressBookEntry {
  FirefoxDriver wd;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook");
    login("admin", "secret");
  }

  @Test
  public void testAddAddressBookEntry() throws Exception {

    initNewBookEntry();
    fillBookEntryForm(new BookEntryNameInfo("Ivan", "Ivanovich", "Ivanov"), new BookEntryCompanyInfo("Software testing", "Software QA", "Moscow, Lenina 44"), new BookEntryPhoneInfo("495555555", "4995555555", "9995556555"), new BookEntryEmailsInfo("4955556555@test.ru", "9185556555@test.ru", "4995556555@test.ru"));
    submitGroupCreation();
    gotoBookEntries();

  }

  private void gotoBookEntries() {
    wd.findElement(By.id("content")).click();
  }

  private void submitGroupCreation() {
    wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  private void fillBookEntryForm(BookEntryNameInfo bookEntryNameInfo, BookEntryCompanyInfo bookEntryCompanyInfo, BookEntryPhoneInfo bookEntryPhoneInfo, BookEntryEmailsInfo bookEntryEmailsInfo) {
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(bookEntryNameInfo.getFirstname());
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(bookEntryNameInfo.getMiddlename());
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(bookEntryNameInfo.getLastname());
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys(bookEntryCompanyInfo.getTitle());
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys(bookEntryCompanyInfo.getCompany());
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(bookEntryCompanyInfo.getAddress());
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(bookEntryPhoneInfo.getHome());
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys(bookEntryPhoneInfo.getWork());
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(bookEntryPhoneInfo.getMobile());
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(bookEntryEmailsInfo.getEmail());
    wd.findElement(By.name("email2")).clear();
    wd.findElement(By.name("email2")).sendKeys(bookEntryEmailsInfo.getEmail1());
    wd.findElement(By.name("email3")).clear();
    wd.findElement(By.name("email3")).sendKeys(bookEntryEmailsInfo.getEmail2());
  }

  private void initNewBookEntry() {
    wd.findElement(By.linkText("add new")).click();
  }

  private void login(String username, String password) {
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  private void logOut() {
    wd.findElement(By.linkText("Logout")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    logOut();
    wd.quit();
  }

}
