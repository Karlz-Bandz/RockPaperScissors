import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {

        int playerPoints = 0;
        int pcPoints = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, welcome to \033[31mROCK \033[0mPAPER \033[34mSCISSORS \033[0m");

        for(int i = 0; i < 5; i++)
        {
            System.out.println("\033[31mPress R to ROCK             \033[35mPLAYER: " + playerPoints);
            System.out.println("\033[0mPress P to PAPER");
            System.out.println("\033[34mPress S to CUTTTT.....          \033[36mPC: " + pcPoints + "\033[0m");
        }


    }
}
