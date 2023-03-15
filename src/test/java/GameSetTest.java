import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import set.GameSet;

public class GameSetTest
{
    private GameSet gameSetTest = new GameSet();

    @Test
    public void CheckStateTest()
    {
        int playerPoint;
        int pcPoint;

        boolean testResponse = gameSetTest.checkState('s');
        System.out.println(testResponse);
        boolean testResponse2 = gameSetTest.checkState('s');
        System.out.println(testResponse2);
        boolean testResponse3 = gameSetTest.checkState('s');
        System.out.println(testResponse3);
        boolean testResponse4 = gameSetTest.checkState('S');
        System.out.println(testResponse4);

        playerPoint = gameSetTest.getPlayerPoints();
        pcPoint = gameSetTest.getPcPoints();
        System.out.println("PC: " + pcPoint);
        System.out.println("Player: " + playerPoint);
    }
    @Test
    public void CheckCorrect_Test()
    {
        boolean expectedA = false;
        boolean expectedB = true;

        boolean testA = gameSetTest.checkCorrect('f');
        boolean testB = gameSetTest.checkCorrect('r');

        Assertions.assertEquals(expectedA,testA);
        Assertions.assertEquals(expectedB, testB);
    }
}
