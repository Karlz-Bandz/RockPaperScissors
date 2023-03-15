package set;

import interfaces.Settingz;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

/*
* This class helps manage the all game logic
 */

@Getter
@Setter
public class GameSet implements Settingz {

  private int playerPoints = 0;
  private int pcPoints = 0;

  private Random rand = new Random(2);


    @Override
    public void pointCounter() {

    }

    @Override
    public int randResponse() {
        return 0;
    }

    @Override
    public boolean checkState() {
        return false;
    }
}
