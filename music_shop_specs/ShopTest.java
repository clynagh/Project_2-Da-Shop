import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;
import behaviours.*;

public class ShopTest {

  Shop shop;
 

  @Before
  public void before() {
    shop = new Shop("Obsolescence");
  }

  @Test
  public void hasName() {
    assertEquals("Obsolescence", shop.getName());
  }

  @Test
  public void canAddStockToStockList(){
    shop.addItemToStockList(202, "Sonic Death");
    assertEquals("Sonic Death", shop.getAlbumNameFromStockList(202));
  }

  @Test
  public void canCountStockInStockList(){
    shop.addItemToStockList(202, "Sonic Death");
    assertEquals(1, shop.countItems());
  }

  @Test
  public void canGetAlbumFromStockList(){
    shop.addItemToStockList(202, "Sonic Death");
    assertEquals("Sonic Death", shop.getAlbumNameFromStockList(202));
  }

  @Test
  public void canRemoveStockFromStockList(){
    shop.addItemToStockList(202, "Sonic Death");
    shop.removeItemFromStockList(202);
    assertEquals(0, shop.countItems());
  }


}

