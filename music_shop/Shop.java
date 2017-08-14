package music_shop;
import java.util.ArrayList;
import java.util.HashMap;
import behaviours.*;

public class Shop {

  private String name;
  private HashMap<Integer, String> stock;

  public Shop(String name){
    this.name = name;
    this.stock = new HashMap<Integer, String>();
  }

  public String getName() {
    return this.name;
  }

  public void addItemToStockList(Integer format_id, String album) {
    stock.put(format_id, album);
  }

  public String getAlbumNameFromStockList(Integer format_id){
    return stock.get(format_id);
  }

  public int countItems() {
    return this.stock.size();
  }

  // public void removeItemFromStockList(Integer format_id){
  //   return stock.remove(format_id);
  // }

}





