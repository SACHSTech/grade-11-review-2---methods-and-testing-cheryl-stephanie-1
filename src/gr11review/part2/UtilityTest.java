package gr11review.part2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import gr11review.part2.Utility;


public class UtilityTest{


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

    /**
     * Methods 2 tests
     * author: Cheryl L
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

    /**
     * File IO Read 2
     * author: Cheryl L
     */

    @Test
    //file with a list of words and the first word in the middle
    void alphaWordTest1 () throws IOException{
        assertEquals("accompany", Utility.alphaWord("/Users/Chery/grade-11-review-2---methods-and-testing-cheryl-stephanie-1-1/src/gr11review/test2/Review2_3Test_1.txt"));

    }

    @Test
    //file with only one word
    void alphaWordTest2 () throws IOException{
        assertEquals("x",Utility.alphaWord("/Users/Chery/grade-11-review-2---methods-and-testing-cheryl-stephanie-1-1/src/gr11review/test2/Review2_3Test_2.txt"));

    }

    @Test
    //file with extra letter to two same words: accompany
    void alphaWordTest3() throws IOException{
        assertEquals("accompanyx", Utility.alphaWord("/Users/Chery/grade-11-review-2---methods-and-testing-cheryl-stephanie-1-1/src/gr11review/test2/Review2_3Test_3.txt"));
    }

    /**
     * Array 2 One Dimensional - one loop
     * author: Cheryl L
     */

    @Test
    //three numbers within the array
    void notAloneTest1() {

        int[] inArray = {1, 2, 3};
        int[] outArray = {1, 3, 3};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,2), outArray));
    }

    @Test
    //six numbers within the array
    void notAloneTest2() {

        int[] inArray = {1, 2, 3, 2, 5, 2};
        int[] outArray = {1, 3, 3, 5, 5, 2};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,2), outArray));
    }
    
    @Test
    //a pair of numbers within the array
    void notAloneTest3() {

        int[] inArray = {3, 4};
        int[] outArray = {3, 4};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,3), outArray));
    }

    @Test
    //one number within the array
    void notAloneTest4() {

        int[] inArray = {6};
        int[] outArray = {6};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,6), outArray));
    }

    /**
     * Array 6 One Dimensional - Two loops
     * author: Cheryl L
     */

    @Test
    //pattern up to three
    void seriesUpTest1() {
        int[] outArray = {1, 1, 2, 1, 2, 3};

        assertTrue(Arrays.equals(Utility.seriesUp(3), outArray));
    }

    @Test
    //pattern up to four
    void seriesUpTest2() {
        int[] outArray = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};

        assertTrue(Arrays.equals(Utility.seriesUp(4), outArray));
    }

    @Test
    //pattern up to two
    void seriesUpTest3() {

        int[] outArray = {1, 1, 2};

        assertTrue(Arrays.equals(Utility.seriesUp(2), outArray));
    }

    /**
     * Array 8 - Two Dimensional
     * author: Cheryl L
     */
    
    @Test
    void splitTest1() {

        int[][] inArray = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] outArray = {{1,2}};

        assertTrue(Arrays.deepEquals(Utility.split(inArray, 0, 1),outArray));
    }

    @Test
    void splitTest2() {

        int[][] inArray = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] outArray = {{1,2}, {4,5}};

        assertTrue(Arrays.deepEquals(Utility.split(inArray, 1, 1), outArray));
    }

    @Test
    void splitTest3() {

        int[] [] inArray = {{1,2,3},{4,5,6},{7,8,9}};
        int[] [] outArray = {{1,2,3}, {4,5,6}, {7,8,9}};

        assertTrue(Arrays.deepEquals(Utility.split(inArray, 2, 2),outArray));
    }
    

}

