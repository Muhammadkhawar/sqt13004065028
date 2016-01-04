
package bstjava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Haris Ali
 */
public class testTest {
    
    public testTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("insert");
        link k=new link();
        k.insert(3);
        k.insert(4);
        k.insert(6);
        boolean exprtresult=false;
        boolean result=k.search(6);
        assertEquals(exprtresult,result);
        fail("The test case is a prototype.");
    }
    
}
