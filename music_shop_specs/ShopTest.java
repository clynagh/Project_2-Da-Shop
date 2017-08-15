import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;
import behaviours.*;

public class ShopTest {

  Shop shop;
  MusicFormat musicFormat;
  MusicType type;
  MusicFormat cassette;
  MusicFormat compactDisc;
  MusicFormat record;
 
  @Before
  public void before() {
    shop = new Shop("Obsolescence");
    cassette = new MusicFormat(202, "Sonic Youth", "Sonic Death", MusicType.CASSETTE, 10, 20);
    compactDisc = new MusicFormat(203, "Violent Femmes", "American People", MusicType.COMPACT_DISC, 8, 16);
    record = new MusicFormat(204, "The Doors", "Morrison Hotel", MusicType.RECORD, 15, 30);
  }

  @Test
  public void hasName() {
    assertEquals("Obsolescence", shop.getName());
  }

  @Test
  public void canAddStockToStockList(){
    shop.addItemToStockList(cassette);
    assertEquals("Sonic Death", shop.getAlbumNameFromStockList(202));
  }

  @Test
  public void canCountStockInStockList(){
    shop.addItemToStockList(cassette);
    assertEquals(1, shop.countItems());
  }

  @Test
  public void canGetAlbumFromStockList(){
    shop.addItemToStockList(cassette);
    assertEquals("Sonic Death", shop.getAlbumNameFromStockList(202));
  }

  @Test
  public void canRemoveStockFromStockList(){
    shop.addItemToStockList(cassette);
    shop.removeItemFromStockList(202);
    assertEquals(0, shop.countItems());
  }
}

