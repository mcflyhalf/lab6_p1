import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * The test class AlgorithmsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AlgorithmsTest
{
    Algorithms algorith1;
    
    /**
     * Default constructor for test class AlgorithmTesterTest
     */
    public AlgorithmsTest()
    {
    }

    /**
     * Sets up the test fiture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        algorith1 = new Algorithms();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

//     @Test
//     public void testFuelConsumption()
//     {
//         assertEquals(10.0, algorith1.calculateFuelConsumption(100.0, 200.0, 10.0), 0.1);
//         assertEquals(40.0, algorith1.calculateFuelConsumption(1000.0, 1200.0, 5.0), 0.1);
//         assertEquals(0.0, algorith1.calculateFuelConsumption(100.0, 100.0, 0.0), 0.1);
//     }
    
    @Test
    public void testexampleAdd()
    {
        assertEquals(30, algorith1.exampleAdd(80, -50));
        assertEquals(140, algorith1.exampleAdd(90, 50));
        assertEquals(27, algorith1.calculateGasBill(0, 27));
    }


    @Test
    public void testmyMultiply()
    {
        assertEquals(6, algorith1.myMultiply(2,3));
        
        //Include More tests to test other conditions 
    }
    
    @Test
    public void testsqrt()
    {
        //Put in appropriate tests
    }
    
    @Test
    public void testisPrime()
    {
        //Include appropriate tests
    }
}
