import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;
import behaviours.*;
import java.util.ArrayList;
import java.util.HashMap;

public class CustomerTest {

  Customer customer;
  MusicFormat musicFormat;
  MusicFormat cassette;
  MusicFormat compactDisc;
  MusicFormat record;
  ArrayList<HashMap<PaymentType, Integer>> jimwallet;
  HashMap<PaymentType, Integer> cashAmount;
  HashMap<PaymentType, Integer> creditCardAmount;
  HashMap<PaymentType, Integer> debitCardAmount;

  
  @Before
  public void before(){
    cassette = new MusicFormat(202, "Sonic Youth", "Sonic Death", MusicType.CASSETTE, 10, 20);
    compactDisc = new MusicFormat(203, "Violent Femmes", "American People", MusicType.COMPACT_DISC, 8, 16);
    record = new MusicFormat(204, "The Doors", "Morrison Hotel", MusicType.RECORD, 15, 30);
    jimwallet = new ArrayList<HashMap<PaymentType, Integer>>();
    cashAmount = new HashMap<PaymentType, Integer>();
    cashAmount.put(PaymentType.CASH, 150);
    creditCardAmount = new HashMap<PaymentType, Integer>();
    creditCardAmount.put(PaymentType.CREDIT_CARD, 450);
    debitCardAmount = new HashMap<PaymentType, Integer>();
    debitCardAmount.put(PaymentType.DEBIT_CARD, 250);
    jimwallet.add(cashAmount);
    jimwallet.add(creditCardAmount);
    jimwallet.add(debitCardAmount);
    customer = new Customer("Jim", jimwallet);
  }

  @Test
  public void hasName(){
    assertEquals("Jim", customer.getName());
  }

  @Test
  public void hasWallet() {
      assertEquals(jimwallet, customer.getWallet());
  }

  @Test
  public void hasPaymentType(){
    assertEquals(cashAmount, customer.getFirstPaymentType());
  }

  @Test
  public void canAddItemToPurchases(){
    customer.addItemToPurchases(cassette);
    assertEquals("Sonic Death", customer.getAlbumNameFromPurchases(202));
  }

  @Test
  public void canCountItemsInPurchases(){
    customer.addItemToPurchases(cassette);
    assertEquals(1, customer.countItems());
  }

  @Test
  public void canGetAlbumFromPurchases(){
    customer.addItemToPurchases(cassette);
    assertEquals("Sonic Death", customer.getAlbumNameFromPurchases(202));
  }

  @Test
  public void canRemoveItemFromPurchases(){
    customer.addItemToPurchases(cassette);
    customer.removeItemFromPurchases(202);
    assertEquals(0, customer.countItems());
  }
}