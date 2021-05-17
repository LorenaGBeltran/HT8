import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Vector;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author loren
 *
 */
class VectorHeapTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        
        Vector<Paciente> pacientesEmer = new Vector<>();
        pacientesEmer.add(new Paciente("Maria","Colon","A"));
        pacientesEmer.add(new Paciente("Maria","Colon","B"));
        VectorHeap instance = new VectorHeap(pacientesEmer);
        String expResult = pacientesEmer.get(0).toString();
        String result = instance.remove().toString();
        System.out.println(result);
        System.out.println(expResult);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Paciente paciente = new Paciente("Karla", "Perez", "A");
        
        VectorHeap instance = new VectorHeap();
        instance.add(paciente);
        
    }

    
}


