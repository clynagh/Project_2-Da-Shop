package music_shop;
import java.util.ArrayList;
import java.util.HashMap;
import behaviours.*;

public class Customer {
  
  String customer;
  HashMap<Integer, MusicFormat> purchases;
  ArrayList<HashMap<PaymentType, Integer>> wallet;

  public Customer(String customer, ArrayList<HashMap<PaymentType, Integer>> wallet){
    this.customer = customer;
    this.purchases = new HashMap<Integer, MusicFormat>();
    this.wallet = wallet;
  }

  public String getName(){
    return this.customer;
  }

  public  ArrayList<HashMap<PaymentType, Integer>> getWallet() {
      return this.wallet;
  }

  public HashMap<PaymentType, Integer> getFirstPaymentType(){
    return this.wallet.get(0);
  }
  
  public void addItemToPurchases(MusicFormat type) {
    purchases.put(type.getFormatId(), type);
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

  public int totalFundAvailable() {
          int totalFundAvailable = 0;

         for (int i = 0; i < wallet.size(); i++) {

             HashMap<PaymentType, Integer> tempHashMap = this.wallet.get(i);
              for (Integer f: tempHashMap.values()) {
                  totalFundAvailable += f.intValue();
              }

         }

         return totalFundAvailable;
      }
}