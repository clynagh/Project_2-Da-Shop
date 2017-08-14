package music_shop;
import behaviours.*;

public class MusicFormat extends StockItem implements Purchaseable {

  private String artist;
  private String album;
  private MusicType type;


  public MusicFormat (String artist, String album, MusicType type, int wholesalePrice, int retailPrice) {
    super(wholesalePrice, retailPrice);
    this.artist = artist;
    this.album = album;
    this.type = type;
  }

  public String getArtistName(){
    return this.artist;
  }

  public String getAlbumName(){
    return this.album;
  }

  public MusicType getType(){
    return this.type;
  }

  public int calculateMarkup(){
    return this.retailPrice - this.wholesalePrice;
  }
}





