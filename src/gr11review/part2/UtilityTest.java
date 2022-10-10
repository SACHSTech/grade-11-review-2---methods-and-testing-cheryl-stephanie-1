package gr11review.part2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest{

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
    void seriesUpTest1() {
        int[] outArray = {1, 1, 2, 1, 2, 3};

        assertTrue(Arrays.equals(Utility.seriesUp(3), outArray));
    }

    @Test
    void seriesUpTest2() {
        int[] outArray = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};

        assertTrue(Arrays.equals(Utility.seriesUp(4), outArray));
    }

    @Test
    void seriesUpTest3() {
        int[] outArray = {0};

        assertTrue(Arrays.equals(Utility.seriesUp(0), outArray));
    }
}    
