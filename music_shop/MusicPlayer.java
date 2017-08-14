package music_shop;
import behaviours.*;

public class MusicPlayer extends StockItem implements Purchaseable {

  private String name;
  private PlayerType type;


  public MusicPlayer (String name, PlayerType type, int wholesalePrice, int retailPrice){
    super(wholesalePrice, retailPrice);
    this.name = name;
    this.type = type;
  }

  public String getPlayerName(){
    return this.name;
  }

  public PlayerType getType(){
    return this.type;
  }

  public int calculateMarkup(){
    return this.retailPrice - this.wholesalePrice;
  }
}