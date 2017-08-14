import static org.junit.Assert.*;
import org.junit.*;
import music_shop.*;
import behaviours.*;


public class MusicPlayerTest {

  MusicPlayer musicPlayer;
  MusicPlayer boombox;
  MusicPlayer cdPlayer;
  MusicPlayer turntable;

  @Before
  public void before(){
boombox = new MusicPlayer("Sony megabass", PlayerType.BOOMBOX, 100, 200);
cdPlayer = new MusicPlayer("Cambridge Audio", PlayerType.CD_PLAYER, 150, 300);
turntable = new MusicPlayer("Project", PlayerType.TURNTABLE, 200, 400);
  }

  @Test
  public void hasPlayerName(){
    assertEquals("Sony megabass", boombox.getPlayerName());
  }

  @Test
  public void hasType(){
    assertEquals(PlayerType.TURNTABLE, turntable.getType());
  }
}