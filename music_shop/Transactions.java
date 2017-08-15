package music_shop;
import java.util.HashMap;
import behaviours.*;

public class Transactions {

  // String shop;
  // HashMap<Integer, String> stock;

  public Transactions(){
    // this.shop = shop;
    // this.stock = new HashMap<Integer, String>();
  }

  public static void getName(Shop shop){
    shop.getName();
  }

  public static void countItems(Shop shop) {
    shop.countItems();
  }

  public static void addItemToStockList(Shop shop, MusicFormat item){
    shop.addItemToStockList(item);
  }

  public static void addItemToPurchases(Customer customer, MusicFormat item){
    customer.addItemToPurchases(item.getFormatId(), item);
  }

  public static void removeItemFromStockList(Shop shop, MusicFormat item){
    shop.removeItemFromStockList(item.getFormatId());
  }

  public static void makeSale(Shop shop, Customer customer, MusicFormat item){
    shop.removeItemFromStockList(item.getFormatId());
    customer.addItemToPurchases(item.getFormatId(), item);
    shop.addToTotalFunds(item.getRetailPrice());
  }

  // public static void makeRefund(Shop shop, Customer customer, MusicFormat item){
  //   customer.removeItemFromPurchases(item.getFormatId());
  //   shop.addItemToStockList(item.getFormatId(), item);
  //   shop.minusFromTotalFunds(item.getRetailPrice());
  // }

  // public String getAlbumNameFromStockList(Integer format_id){
  //   return stock.get(format_id);
  // }

  // public static void sellItem(Shop shop, Customer customer){
  //   shop.removeItemFromStockList()
  //   customer.addItemToCustomer()

  // }

}



// To buy - customer("Jim") needs to buy cassette("Sonic Death") and pay with PaymentType.CASH - the cassette object will be deleted from the Stocklist HashMap in the shop and will be deposited in the Purchases HashMap.





// When buying - the shop will increase sales buy retail price amount. How best to do this?


// To Refund - customer("Jim") needs to return cassette("Sonic Death") and have money refunded: PaymentType.CASH. The cassette object will be deleted from Purchases HashMap and deposited in the Stocklist HashMap.


// When refunding - the shop will return money to customer and will subtract money from total sales?

