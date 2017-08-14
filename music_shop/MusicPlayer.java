package music_shop;
import behaviours.*;

public class MusicPlayer extends StockItem implements Purchaseable {

  private int player_id;
  private String name;
  private PlayerType type;


  public MusicPlayer (int player_id, String name, PlayerType type, int wholesalePrice, int retailPrice){
    super(wholesalePrice, retailPrice);
    this.player_id = player_id;
    this.name = name;
    this.type = type;
  }

  public int getPlayerId(){
    return this.player_id;
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