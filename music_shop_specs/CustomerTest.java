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
}