package core.tdd.test;

import static org.junit.Assert.*;
import org.junit.Test;

import core.tdd.isbn.*;

public class StockManagementTests {
  @Test
  public void testCanGetACorrectLocatorCode() {
    ExternalISBNDataService testService = new ExternalISBNDataService() {
      @Override
      public Book lookup(String isbn) {
        return new Book(isbn, "Of Mice and Men", "J. Steinbeck");
      }
    };

    StockManager stockManager = new StockManager();
    stockManager.setService(testService);

    String isbn = "0140177396";
    String locatorCode = stockManager.getLocatorCode(isbn);
    assertEquals("7396J4", locatorCode);
  }
}
