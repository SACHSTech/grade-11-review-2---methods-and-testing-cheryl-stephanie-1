package gr11review.part2;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;



public class UtilityTest{

   

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
