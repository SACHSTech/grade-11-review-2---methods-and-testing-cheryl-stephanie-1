package gr11review.test2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import gr11review.part2.Methods1;


public class Methods1Test {

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