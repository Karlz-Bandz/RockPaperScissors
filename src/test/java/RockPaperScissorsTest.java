import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RockPaperScissorsTest {

    private RockPaperScissors rockPaperScissorsTest;

    RockPaperScissorsTest(){
       rockPaperScissorsTest = new RockPaperScissors();
    }

    @Test
    public void PrintenL_Test(){
        boolean tester = rockPaperScissorsTest.printenL(340);

        Assertions.assertEquals(tester, true);
    }
}
