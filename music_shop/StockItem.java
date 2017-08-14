package music_shop;
import behaviours.*;

public abstract class StockItem implements Purchaseable {
  protected int wholesalePrice;
  protected int retailPrice;

  public StockItem(int wholesalePrice, int retailPrice) {
    this.wholesalePrice = wholesalePrice;
    this.retailPrice = retailPrice;
  }

  public int getWholesalePrice() {
    return this.wholesalePrice;
  }

  public int getRetailPrice() {
    return this.retailPrice;
  }
}