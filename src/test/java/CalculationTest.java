import org.junit.*;

import java.util.Random;

public class CalculationTest {
    private static Random random;
    private int n;


    @BeforeClass
    public void beforeEveryTest () {
        random = new Random();
    }

    @Before
    public void beforeEveryTest() {
        n = random.nextInt(Integer.MAX_VALUE);
    }

    @Test
    public void testSquareShouldReturnZeroPassed() {
        Assert.assertEquals(Calculations.square(0), 0);
    }
        @Test
        public void testSquareShoulReturnCorrectValue () {
            Assert.assertEquals(Calculations.square(n), n * n);
        }


    @After
    public void afterEveryTest() {
    }
}
