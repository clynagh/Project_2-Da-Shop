import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;
import behaviours.*;
import java.util.ArrayList;
import java.util.HashMap;


public class TransactionTest {

  Shop shop;
  Customer customer;
  PaymentType type;
  MusicFormat musicFormat;
  MusicFormat cassette;
  MusicFormat compactDisc;
  MusicFormat record;
  MusicPlayer musicPlayer;
  MusicPlayer boombox;
  MusicPlayer cdPlayer;
  MusicPlayer turntable;
  // Wallet jimwallet;
  ArrayList<HashMap<PaymentType, Integer>> jimwallet;
  HashMap<PaymentType, Integer> cashAmount;
  HashMap<PaymentType, Integer> creditCardAmount;
  HashMap<PaymentType, Integer> debitCardAmount;
  
  @Before
  public void before(){
    shop = new Shop("Obsolescence");
    cassette = new MusicFormat(202, "Sonic Youth", "Sonic Death", MusicType.CASSETTE, 10, 20);
    compactDisc = new MusicFormat(203, "Violent Femmes", "American People", MusicType.COMPACT_DISC, 8, 16);
    record = new MusicFormat(204, "The Doors", "Morrison Hotel", MusicType.RECORD, 15, 30);
    boombox = new MusicPlayer(101, "Sony megabass", PlayerType.BOOMBOX, 100, 200);
    cdPlayer = new MusicPlayer(102, "Cambridge Audio", PlayerType.CD_PLAYER, 150, 300);
    turntable = new MusicPlayer(103, "Project", PlayerType.TURNTABLE, 200, 400);
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
    assertEquals("Obsolescence", shop.getName());
  }

  @Test
  public void canCountItems(){
    assertEquals(0, shop.countItems());
  }

  @Test
  public void canAddStockToStockList(){
    Transactions.addItemToStockList(shop, compactDisc);
    assertEquals(1, shop.countItems());
  }

  @Test
  public void canAddItemToPurchases(){
    Transactions.addItemToPurchases(customer, compactDisc);
    assertEquals(1, customer.countItems());
  }

  @Test
  public void canMakeSale(){
    shop.addItemToStockList(record);
    assertEquals(1, shop.countItems());
    Transactions.makeSale(shop, customer, record);
    assertEquals(0, shop.countItems());
    assertEquals(1, customer.countItems());
    assertEquals(1030, shop.getTotalFunds());
  }

  @Test
  public void canMakeRefund(){
    customer.addItemToPurchases(record);
    Transactions.makeRefund(customer, shop, record);
    assertEquals(0, customer.countItems());
    assertEquals(1, shop.countItems());
    assertEquals(970, shop.getTotalFunds());
  }
}