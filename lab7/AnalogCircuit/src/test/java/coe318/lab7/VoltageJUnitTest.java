package coe318.lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ivan wang 501086429
 */
public class VoltageJUnitTest {

    public VoltageJUnitTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNodes method, of Voltage class
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
        Voltage instance = new Voltage(1, 0, 5);
        int[] expResult = {1, 0};
        int[] result = instance.getNodes();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of toString method, of Voltage class
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Voltage instance = new Voltage(2, 3, 10);
        String expResult = "V2 2 3 DC 10.0"; //V2 because an instance of voltage (V1) was already created in testGetNodes()
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
