

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PropertyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PropertyTest
{   
    private Property property1;
    
    @Test
    public void testConstructor(){
        property1 = new Property("T3 Monte Belo", 150000.0);
        assertEquals("T3 Monte Belo", property1.getDescription());
        assertEquals(150000.0, property1.getPrice());
    }
    
    @Test
    public void testToString(){
        property1 = new Property("T3 Monte Belo", 150000.0);
        assertEquals("Descrição: T3 Monte Belo" + "\n" + "Preço: 150000.0 Euros", property1.toString());
    }
}
