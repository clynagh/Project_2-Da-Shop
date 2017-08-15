package music_shop;
import java.util.HashMap;
import behaviours.*;

public class Transactions {

  String shop;
  HashMap<Integer, String> stock;

  public Transactions(){
    this.shop = shop;
    this.stock = new HashMap<Integer, String>();
  }

  public String getName(){
    return this.shop;
  }

  public void addItemToStockList(Integer format_id, String album){
    stock.put(format_id, album);
  }

  public String getAlbumNameFromStockList(Integer format_id){
    return stock.get(format_id);
  }

}



// To buy - customer("Jim") needs to buy cassette("Sonic Death") and pay with PaymentType.CASH - the cassette object will be deleted from the Stocklist HashMap in the shop and will be deposited in the Purchases HashMap.





// When buying - the shop will increase sales buy retail price amount. How best to do this?


// To Refund - customer("Jim") needs to return cassette("Sonic Death") and have money refunded: PaymentType.CASH. The cassette object will be deleted from Purchases HashMap and deposited in the Stocklist HashMap.


// When refunding - the shop will return money to customer and will subtract money from total sales?

