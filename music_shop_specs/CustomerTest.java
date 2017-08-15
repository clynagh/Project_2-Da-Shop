import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;
import behaviours.*;

public class CustomerTest {

  Customer customer;
  PaymentType type;
  MusicFormat musicFormat;
  MusicFormat cassette;
  MusicFormat compactDisc;
  MusicFormat record;
  
  @Before
  public void before(){
    customer = new Customer("Jim", PaymentType.CASH);
    cassette = new MusicFormat(202, "Sonic Youth", "Sonic Death", MusicType.CASSETTE, 10, 20);
    compactDisc = new MusicFormat(203, "Violent Femmes", "American People", MusicType.COMPACT_DISC, 8, 16);
    record = new MusicFormat(204, "The Doors", "Morrison Hotel", MusicType.RECORD, 15, 30);
  }

  @Test
  public void hasName(){
    assertEquals("Jim", customer.getName());
  }

  @Test
  public void hasPaymentType(){
    assertEquals(PaymentType.CASH, customer.getPaymentType());
  }

  @Test
  public void canAddItemToPurchases(){
    customer.addItemToPurchases(202, cassette);
    assertEquals("Sonic Death", customer.getAlbumNameFromPurchases(202));
  }

  @Test
  public void canCountItemsInPurchases(){
    customer.addItemToPurchases(202, cassette);
    assertEquals(1, customer.countItems());
  }

  @Test
  public void canGetAlbumFromPurchases(){
    customer.addItemToPurchases(202, cassette);
    assertEquals("Sonic Death", customer.getAlbumNameFromPurchases(202));
  }

  @Test
  public void canRemoveItemFromPurchases(){
    customer.addItemToPurchases(202, cassette);
    customer.removeItemFromPurchases(202);
    assertEquals(0, customer.countItems());
  }
}