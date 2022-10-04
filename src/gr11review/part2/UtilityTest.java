package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest{

    int[] nums = {1, 10, 10, 2};
    int[] ans = {1,2,0,0};

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

    @Test
    void test3(){
        assertArrayEquals(ans, Utility.withoutTen(nums));
    }
  
}
