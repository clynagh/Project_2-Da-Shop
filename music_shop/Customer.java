package music_shop;
import java.util.ArrayList;
import java.util.HashMap;
import behaviours.*;


public class Customer {
  
  private String customer;
  private PaymentType type;
  private HashMap<Integer, String> purchases;


  public Customer(String customer, PaymentType type){
    this.customer = customer;
    this.type = type;
    this.purchases = new HashMap<Integer, String>();
  }

  public String getName(){
    return this.customer;
  }

  public PaymentType getPaymentType(){
    return this.type;
  }

  public void addItemToPurchases(Integer format_id, String album) {
    purchases.put(format_id, album);
  }

  public String getAlbumNameFromPurchases(Integer format_id){
    return purchases.get(format_id);
  }

  public int countItems() {
    return this.purchases.size();
  }

  public void removeItemFromPurchases(Integer format_id){
    purchases.remove(format_id);

  }



}