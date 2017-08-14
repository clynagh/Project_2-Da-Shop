import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;
import behaviours.*;


public class CustomerTest {

  Customer customer;


  @Before
  public void before(){
    customer = new Customer("Jim");
  }

  @Test
  public void hasName(){
    assertEquals("Jim", customer.getName());
  }

  @Test
  public void canAddItemToPurchases(){
    customer.addItemToPurchases(202, "Sonic Death");
    assertEquals("Sonic Death", customer.getAlbumNameFromPurchases(202));
  }

  @Test
  public void canCountItemsInPurchases(){
    customer.addItemToPurchases(202, "Sonic Death");
    assertEquals(1, customer.countItems());
  }

  @Test
  public void canGetAlbumFromPurchases(){
    customer.addItemToPurchases(202, "Sonic Death");
    assertEquals("Sonic Death", customer.getAlbumNameFromPurchases(202));
  }

  @Test
  public void canRemoveItemFromPurchases(){
    customer.addItemToPurchases(202, "Sonic Death");
    customer.removeItemFromPurchases(202);
    assertEquals(0, customer.countItems());
  }

}