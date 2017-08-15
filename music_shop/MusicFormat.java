package music_shop;
import behaviours.*;

public class MusicFormat extends StockItem implements Purchaseable {

  int format_id;
  String artist;
  String album;
  MusicType type;

  public MusicFormat (int format_id, String artist, String album, MusicType type, int wholesalePrice, int retailPrice) {
    super(wholesalePrice, retailPrice);
    this.format_id = format_id;
    this.artist = artist;
    this.album = album;
    this.type = type;
  }

  public int getFormatId(){
    return this.format_id;
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





