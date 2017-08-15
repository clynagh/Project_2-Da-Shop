package music_shop;
import java.util.ArrayList;
import java.util.HashMap;
import behaviours.*;

public class Customer {
  
  private String customer;
  private PaymentType type;
  private HashMap<Integer, MusicFormat> purchases;

  public Customer(String customer, PaymentType type){
    this.customer = customer;
    this.type = type;
    this.purchases = new HashMap<Integer, MusicFormat>();
  }

  public String getName(){
    return this.customer;
  }

  public PaymentType getPaymentType(){
    return this.type;
  }

  public void addItemToPurchases(Integer format_id, MusicFormat type) {
    purchases.put(format_id, type);
  }

  public String getAlbumNameFromPurchases(Integer format_id){
    return purchases.get(format_id).getAlbumName();
  }

  public int countItems() {
    return this.purchases.size();
  }

  public void removeItemFromPurchases(Integer format_id){
    purchases.remove(format_id);
  }
}