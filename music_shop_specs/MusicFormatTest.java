import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;
import behaviours.*;

public class MusicFormatTest {

  MusicFormat musicFormat;
  MusicType type;
  MusicFormat cassette;
  MusicFormat compactDisc;
  MusicFormat record;

  @Before
  public void before(){
 cassette = new MusicFormat("Sonic Youth", "Sonic Death", MusicType.CASSETTE, 10, 20);
 compactDisc = new MusicFormat("Violent Femmes", "American People", MusicType.COMPACT_DISC, 8, 16);
 record = new MusicFormat("The Doors", "Morrison Hotel", MusicType.RECORD, 15, 30);

  }

  @Test
  public void hasArtistName(){
    assertEquals("Sonic Youth", cassette.getArtistName());
  }

  @Test
  public void hasAlbumName(){
    assertEquals("American People", compactDisc.getAlbumName());
  }

  @Test
  public void hasType(){
    assertEquals(MusicType.COMPACT_DISC, compactDisc.getType());
  }

  @Test
   public void canGetMarkup() {
     assertEquals(15, record.calculateMarkup());
   }

}
