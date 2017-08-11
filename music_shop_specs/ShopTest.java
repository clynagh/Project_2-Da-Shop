import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;
import behaviours.*;

public class ShopTest {

  Shop shop;



  @Before
  public void before(){
    shop = new Shop ("Obsolescence");
  }

  @Test
  public void hasName(){
    assertEquals("Obsolescence", shop.getName());
  }
}
