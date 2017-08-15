import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;
import behaviours.*;

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
  
  @Before
  public void before(){
    shop = new Shop("Obsolescence");
    customer = new Customer("Jim", PaymentType.CASH);
    cassette = new MusicFormat(202, "Sonic Youth", "Sonic Death", MusicType.CASSETTE, 10, 20);
    compactDisc = new MusicFormat(203, "Violent Femmes", "American People", MusicType.COMPACT_DISC, 8, 16);
    record = new MusicFormat(204, "The Doors", "Morrison Hotel", MusicType.RECORD, 15, 30);
    boombox = new MusicPlayer(101, "Sony megabass", PlayerType.BOOMBOX, 100, 200);
    cdPlayer = new MusicPlayer(102, "Cambridge Audio", PlayerType.CD_PLAYER, 150, 300);
    turntable = new MusicPlayer(103, "Project", PlayerType.TURNTABLE, 200, 400);
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
  public void canMoveStockFromStockListToPurchases(){
    Transactions.addItemToStockList(shop, cassette);
    assertEquals(1, shop.countItems());
    Transactions.removeItemFromStockList(shop, cassette);
    assertEquals(0, shop.countItems());
    Transactions.addItemToPurchases(customer, cassette);
    assertEquals(1, customer.countItems());
    
  }

  // @Test
  // public void canAddStockToStockList(){
  //   Transactions.sellItem()
  //   shop.addItemToStockList(203, "Violent Femmes");
  //   assertEquals("Violent Femmes", shop.getAlbumNameFromStockList(203));
  // }
}