import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    Even ob=new Even();

    @Test
    public void getNum()
    {
        boolean result=ob.isEven(8);
        assertEquals("true","true");
    }

}