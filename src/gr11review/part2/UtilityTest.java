package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest{

    @Test
    void testSignature(){
        assertEquals(true, Methods1.xyBalance("aaxbby"));
    }
    
    @Test
    void test1(){
        assertEquals(false, Methods1.xyBalance("aaxbb"));
    }

    @Test
    void test2(){
        assertEquals(false, Methods1.xyBalance("yaaxbb"));
    }
  
}
