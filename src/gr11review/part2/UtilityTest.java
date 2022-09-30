package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest{

    @Test
    void testSignature(){
        assertEquals(true, Utility.xyBalance("aaxbby"));
    }
    
    @Test
    void test1(){
        assertEquals(false, Utility.xyBalance("aaxbb"));
    }

    @Test
    void test2(){
        assertEquals(false, Utility.xyBalance("yaaxbb"));
    }
  
}
