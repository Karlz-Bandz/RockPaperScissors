package set;

import interfaces.Settingz;
import java.util.Random;

/*
* This class helps manage the all game logic
 */

public class GameSet implements Settingz {

  private int playerPoints = 0;
  private int pcPoints = 0;
  private Random rand = new Random();

  public int getPlayerPoints() {
    return playerPoints;
  }

  public int getPcPoints() {
    return pcPoints;
  }

    @Override
    public boolean checkState(char playerChose)
    {
      int playerIntChose = 0;
      int pcIntChose = rand.nextInt(3);

      if(Character.toUpperCase(playerChose) == 'R')
        playerIntChose = 0;
      else if(Character.toUpperCase(playerChose) == 'P')
        playerIntChose = 1;
      else if(Character.toUpperCase(playerChose) == 'S')
        playerIntChose = 2;

      System.out.println(pcIntChose);
      System.out.println(playerIntChose);

      if(playerIntChose == pcIntChose)
        return false;

      if(playerIntChose == 0 && pcIntChose == 1)
      {
        ++pcPoints;
        return true;
      }else if(playerIntChose == 0 && pcIntChose == 2)
      {
        ++playerPoints;
        return true;
      }else if(playerIntChose == 1 && pcIntChose == 0)
      {
        ++playerPoints;
        return true;
      }else if(playerIntChose == 1 && pcIntChose == 2)
      {
        ++pcPoints;
        return true;
      }else if(playerIntChose == 2 && pcIntChose == 0)
      {
        ++pcPoints;
        return true;
      }else if(playerIntChose == 2 && pcIntChose == 1)
      {
        ++playerPoints;
        return true;
      }



        return false;
    }
}
