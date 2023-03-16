package set;

import interfaces.Settingz;
import java.util.Random;
import java.util.Scanner;

/*
* This class helps manage the all game logic
 */
public class GameSet implements Settingz {

  private Scanner scanner = new Scanner(System.in);
  private int playerPoints = 0;
  private int pcPoints = 0;
  private Random rand = new Random();

  private int getPlayerPoints() {
    return playerPoints;
  }

  private int getPcPoints() {
    return pcPoints;
  }

  private void setPlayerPoints(int points)
  {
    this.playerPoints = points;
  }
  private void setPcPoints(int points)
  {
    this.pcPoints = points;
  }







  @Override
  public void gameBody()
  {
    for(int i = 0; i < 5; i++)
    {
      System.out.println("\033[31mPress R to ROCK             \033[35mPLAYER: " + this.playerPoints);
      System.out.println("\033[0mPress P to PAPER");
      System.out.println("\033[34mPress S to CUTTTT.....          \033[36mPC: " + this.pcPoints + "\033[0m");

      boolean buchstabeState = false;
      char valotileBuchstabe = 'R';

      while(!buchstabeState)
      {
        valotileBuchstabe = scanner.next().charAt(0);
        buchstabeState = this.checkCorrect(valotileBuchstabe);
      }

      this.checkState(valotileBuchstabe);

    }
    this.setWhoWin();

  }
  private String translationFromInt(int number)
  {
          if(number == 0)
              return "\33[31mROCK\33[0m";
          else if(number == 1)
              return "PAPER";
          else if(number == 2)
             return "\33[34mSCISSORS\33[0m";

          return "Errix";
  }
  private boolean checkState(char playerChose)
  {
    int playerIntChose = 0;
    int pcIntChose = rand.nextInt(3);

    if(Character.toUpperCase(playerChose) == 'R')
      playerIntChose = 0;
    else if(Character.toUpperCase(playerChose) == 'P')
      playerIntChose = 1;
    else if(Character.toUpperCase(playerChose) == 'S')
      playerIntChose = 2;

    System.out.println();
    System.out.println("\033[36m----PC: \033[0m" + translationFromInt(pcIntChose));
    System.out.println("\033[35mPlayer: \033[0m" + translationFromInt(playerIntChose));
    System.out.println();

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
  private boolean checkCorrect(char buchstabe)
  {
    if(Character.toUpperCase(buchstabe) == 'P')
      return true;
    else if(Character.toUpperCase(buchstabe) == 'R')
      return true;
    else if(Character.toUpperCase(buchstabe) == 'S')
      return true;

    return false;
  }
  private void setWhoWin() {
    if(this.pcPoints > this.playerPoints)
    {
      System.out.println("\033[36mPC WON THE GAME");
      System.out.println("PLEASE CLICK ANY KEY...\033[0m");
      scanner.nextLine();
      scanner.nextLine();
    }else if(this.pcPoints < this.playerPoints)
    {
      System.out.println("\033[35mPLAYER WON THE GAME");
      System.out.println("PLEASE CLICK ANY KEY...\033[0m");
      scanner.nextLine();
      scanner.nextLine();
    }else if(this.pcPoints == this.playerPoints)
    {
      System.out.println("\033[31mNoONE WON THE GAME");
      System.out.println("PLEASE CLICK ANY KEY TO PLAY AGAIN...\033[0m");
      scanner.nextLine();
      scanner.nextLine();
      this.pcPoints = 0;
      this.playerPoints = 0;
      this.gameBody();
    }
  }
}
