package music_shop;
import java.util.ArrayList;
import java.util.HashMap;
import behaviours.*;

public class Shop {

  String name;
  HashMap<Integer, MusicFormat> stock;
  int totalfunds;

  public Shop(String name){
    this.name = name;
    this.stock = new HashMap<Integer, MusicFormat>();
    this.totalfunds = 1000;
  }

  public String getName() {
    return this.name;
  }

  public int getRetailPrice(MusicFormat type){
    stock.put(type.getFormatId(), type);
    return stock.get(type.format_id).getRetailPrice();
  }

  public void addItemToStockList(MusicFormat type) {
    stock.put(type.getFormatId(), type);
  }

  public String getAlbumNameFromStockList(Integer format_id){
    return stock.get(format_id).getAlbumName();
  }

  public int countItems() {
    return this.stock.size();
  }

  public void removeItemFromStockList(Integer format_id){
    stock.remove(format_id);
  }

  public int getTotalFunds(){
    return this.totalfunds;
  }

  public void addToTotalFunds(int amount){
    this.totalfunds += amount;
  }

  public void minusFromTotalFunds(int amount){
    this.totalfunds -= amount;
  }

 

}


// for (Object value : map.values()) {
// // ...
// }

// stock.put(type.getFormatId(), type);
// return totalfunds + stock.get(type.format_id).getRetailPrice();





