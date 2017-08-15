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
 cassette = new MusicFormat(202, "Sonic Youth", "Sonic Death", MusicType.CASSETTE, 10, 20);
 compactDisc = new MusicFormat(203, "Violent Femmes", "American People", MusicType.COMPACT_DISC, 8, 16);
 record = new MusicFormat(204, "The Doors", "Morrison Hotel", MusicType.RECORD, 15, 30);
  }

  @Test
  public void hadFormatId(){
    assertEquals(204, record.getFormatId());
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
