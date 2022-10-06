package gr11review.part2;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import gr11review.part2.Utility;

/**
 * Grade 11 Java Review Part 2 Test Solutions
 * @author Stephanie Tam
 */

public class UtilityTest{

    int[] withoutTenNums1 = {1, 10, 10, 2};
    int[] withoutTenAns1 = {1, 2, 0, 0};
    int[] withoutTenNums2 = {10, 2, 10};
    int[] withoutTenAns2 = {2, 0, 0};
    int[] withoutTenNums3 = {1, 99, 10};
    int[] withoutTenAns3 = {1, 99, 0};

    int[] zeroFrontNums1 = {1, 0, 0, 1};
    int[] zeroFrontAns1 = {0, 0, 1, 1};
    int[] zeroFrontNums2 = {0, 1, 1, 0, 1};
    int[] zeroFrontAns2 = {0, 0, 1, 1, 1};
    int[] zeroFrontNums3 = {1, 0};
    int[] zeroFrontAns3 = {0, 1};

    int[] canBalanceNums1 = {1, 1, 1, 2, 1};
    int[] canBalanceNums2 = {2, 1, 1, 2, 1};
    int[] canBalanceNums3 = {10, 10};
    
    /**
     * Test for Methods 1
     * @author S. Tam
     */
    
    @Test
    void xyBalanceTest1(){
        assertEquals(true, Utility.xyBalance("aaxbby"));
    }
    
    @Test
    void xyBalanceTest2(){
        assertEquals(false, Utility.xyBalance("aaxbb"));
    }

    @Test
    void xyBalanceTest3(){
        assertEquals(false, Utility.xyBalance("yaaxbb"));
    }

    /**
     * Test for File IO - Read 1
     * @author S. Tam
     */

    @Test
    void longestWordTest1() throws IOException{
        assertEquals("conservation", Utility.longestWord("/Users/Cindy/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-cheryl-stephanie-1/src/gr11review/test2/Review2_3Test_1.txt"));
    }

    @Test
    void longestWordTest2() throws IOException{
        assertEquals("x", Utility.longestWord("/Users/Cindy/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-cheryl-stephanie-1/src/gr11review/test2/Review2_3Test_2.txt"));
    }

    @Test
    void longestWordTest3() throws IOException{
        assertEquals("conservation", Utility.longestWord("/Users/Cindy/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-cheryl-stephanie-1/src/gr11review/test2/Review2_3Test_3.txt"));
    }

    @Test
    void longestWordTest4() throws IOException{
        assertEquals("conservation", Utility.longestWord("/Users/Cindy/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-cheryl-stephanie-1/src/gr11review/test2/Review2_3Test_4.txt"));
    }

    /**
     * Test for Array 1 - One Dimensional
     * @author S. Tam
     */

    @Test
    void withoutTenTest1(){
        assertArrayEquals(withoutTenAns1, Utility.withoutTen(withoutTenNums1));
    }

    @Test
    void withoutTenTest2(){
        assertArrayEquals(withoutTenAns2, Utility.withoutTen(withoutTenNums2));
    }

    @Test
    void withoutTenTest3(){
        assertArrayEquals(withoutTenAns3, Utility.withoutTen(withoutTenNums3));
    }

    /**
     * Test for Array 3 - One Dimensional
     * @author S. Tam
     */

    @Test
    void zeroFrontTest1(){
        assertArrayEquals(zeroFrontAns1, Utility.zeroFront(zeroFrontNums1));
    }

    @Test
    void zeroFrontTest2(){
        assertArrayEquals(zeroFrontAns2, Utility.zeroFront(zeroFrontNums2));
    }

    @Test
    void zeroFrontTest3(){
        assertArrayEquals(zeroFrontAns3, Utility.zeroFront(zeroFrontNums3));
    }

    /**
     * Test for Array 5 - One Dimensional - Two Loops
     * @author S. Tam
     */

    @Test
    void canBalanceTest1(){
        assertEquals(true, Utility.canBalance(canBalanceNums1));
    }

    @Test
    void canBalanceTest2(){
        assertEquals(false, Utility.canBalance(canBalanceNums2));
    }

    @Test
    void canBalanceTest3(){
        assertEquals(true, Utility.canBalance(canBalanceNums3));
    }


/**
 * Grade 11 Java Review Part 2 Test Solutions
 * @author Cheryl Lee
 */

    @Test
    // test with no numbers

    void sumNumbersTest1 () throws IOException{

        assertEquals(0, Utility.sumNumbers("abc"));
    }

    @Test
    //one number
    void sumNumbersTest2 () throws IOException{

        assertEquals(123, Utility.sumNumbers("abc123xyz"));
    }

    @Test
    //only numbers
    void sumNumbersTest3 () throws IOException{

        assertEquals(18, Utility.sumNumbers("7 11"));
    }

    @Test
    //two numbers
    void sumNumbersTest4 () throws IOException{

        assertEquals(44, Utility.sumNumbers("aa11b33"));
    }

    @Test
    //nothing in the string
    void sumNumbersTest5 () throws IOException{

        assertEquals(0, Utility.sumNumbers(""));
    }
}
