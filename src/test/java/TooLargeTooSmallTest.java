
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TooLargeTooSmallTest{

    public TooLargeTooSmallTest() {

    }


    @org.junit.jupiter.api.Test
    public void TestRun1(){
        TooLargeTooSmall tooLarge1 = new TooLargeTooSmall(5);
        assertEquals(Integer.valueOf(0), tooLarge1.guess(5));
    }

    @Test
    public void TestRun2(){
        TooLargeTooSmall tooLarge1 = new TooLargeTooSmall(6);
        assertEquals(Integer.valueOf(-1), tooLarge1.guess(4));
    }

    @Test
    public void TestRun3(){
        TooLargeTooSmall tooLarge1 = new TooLargeTooSmall(2);

        assertEquals(Integer.valueOf(-1), tooLarge1.guess(1));
        assertEquals(Integer.valueOf(0), tooLarge1.guess(2));
        assertEquals(Integer.valueOf(1), tooLarge1.guess(3));
    }


}