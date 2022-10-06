package gr11review.part2;
import java.io.*;
import java.io.IOException;

/**
 * Grade 11 Java Review Part 2
 * @author Stephanie Tam
 */

public class Utility {
    //------------------------------------------------------

    /**
     * Array 5 - One Dimensional - Two Loops
     * A program determiens if array can be split equally
     * @author Stephanie Tam
     * @param nums Array to be split
     * @return boolean if array split equally
     */

    public static boolean canBalance(int[] nums) {

        // initialize variables
        int intLeftSum = 0;
        int intRightSum = 0;
        int i;
        
        // for loop sum of left side of array
        for(i = 0; i < nums.length; i++){
            intRightSum = 0;
            intLeftSum += nums[i];

            // for loop sum of right side of array
            for (int x = (nums.length - 1); x > i; x--){
                intRightSum += nums[x];

                // if left and right sum matches, return true
                if (intLeftSum == intRightSum && x == (i + 1)){
                    return true;
                }
            }
        }
        return false;
    }

    //------------------------------------------------------

    /**
     * Array 3 - One Dimensional
     * A program that rearranges all the zeros to be grouped at the start of the array. 
     * @author Stephanie Tam
     * @param nums integer array
     * @return version of array with zeroes at the start
     */

    public static int [] zeroFront(int[] nums){

        // initialize variables
        int update = 0;
        int i;
        int x;
    
        // for loop to check where equals zero in array 
        for (i = 0; i < nums.length; i++){
          if (nums[i] == 0 ){
            nums[i] = nums[update];
            nums[update] = 0;
            update++;
          }
        }

        for (x = 0; x < nums.length; x++){
            System.out.print(nums[x]);
          }
        System.out.println("");

        // return array
        return nums;
      }
    
    //------------------------------------------------------

    /**
     * Array 1 - One Dimensional
     * A program that removes 10's and replaced with 0 at the end of array. 
     * @author Stephanie Tam
     * @param nums
     * @param intArray new copy of the array
     * @param intZero number of zeros
     * @param intIndex index number of array
     * @param intCount number count
     * @return intArray version of array with 10's removed
     */

    public static int[] withoutTen(int[] nums) {
        
        // initialize variables
        int intZero = 0;
        int intIndex;
        int intCount;
        int[] intArray = new int[nums.length];

        // for loop to go through elements in array
        for (intIndex = 0; intIndex < nums.length; intIndex++){

            // if not 10
            if (nums[intIndex] != 10){
                intArray[intIndex - intZero] = nums[intIndex];
            }
            // if 10, increase intZero
            else if (nums[intIndex] == 10){
                intZero++;
            }
        }
       
        // if statement for when there are zeros
        if (intZero != 0){
            for (intCount = 0; intCount < intZero; intCount++){
                intArray[(nums.length - 1) - intCount] = 0;
            }
        }
        // return new array without 10
        return intArray;
    }

    //------------------------------------------------------

    /**
     * File IO - Read 1
     * A program that returns the longest word in the file.
     * @author Stephanie Tam
     * @param filenametxt enters file from directory
     * @param strLongestWord longest word length
     * @param strCurrentLength word length of current word
     * @return longest string word
     * @throws IOException
     */

    public static String longestWord(String filenametxt)throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(filenametxt));

        // initialize variables
        String strLongestWord = "";
        String strCurrentLength;
        
        // while loop to go through each line to find the longest word
        String line = reader.readLine();
        while (line != null) {
            strCurrentLength = line;
            if (strCurrentLength.length() > strLongestWord.length()){
                strLongestWord = strCurrentLength;
            }
            line = reader.readLine();
            System.out.print(strCurrentLength);
        }
        reader.close();

        // return longest word
        return strLongestWord;
    }

    //------------------------------------------------------

    /**
     * Methods 1
     * A program that will return true/false if the given string is xy-balanced.
     * @author Stephanie Tam
     * @param x boolean false
     * @param y boolean false
     * @return boolean if string is xy-balanced
     */
    
    public static boolean xyBalance(String str){

        // initialize variables
        boolean x = false;
        boolean y = false;
        int i;

        int length = str.length();

        // for loop to check chars
        for (i = 0; i < length; i++) {
            if (str.charAt(i) == 'x' && y == true){
                x = true;
                y = false;
            } 
                else if (str.charAt(i) == 'x') {
                    x = true;
                }
            if (str.charAt(i) == 'y' && x == true){
                y = true;
            }
            if (x == false){
                y = true;
            }
        }
        // return boolean
        return y;
    }

    //------------------------------------------------------

public class Utility {

    /**
     * author: Cheryl L
     * @param str intput letters and words in one string
     * @return 
     * the sum of the numbers within the array
     */
   
    public static int sumNumbers(String str){

        int sumNum = 0;
        String strDigit = "";

        for (int d = 0; d < str.length(); d++) {

            if (Character.isDigit(str.charAt(d))) {

                if(d < str.length() - 1 && Character.isDigit(str.charAt(d + 1))){

                    strDigit += str.charAt(d);
                }
              
                else {   

                    strDigit += str.charAt(d);
                    sumNum += Integer.parseInt(strDigit);
                    strDigit = "";
                }
            }
        }

        return sumNum;
    }

    /**
     * author: Cheryl L
     * @param filenametxt finds the proper file by using pathways
     * @return 
     * outputs the word that is alphabetically first within the file given
     * @throws IOException
     * used for BufferedReader
     */

    public static String alphaWord(String filenametxt) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("/Users/Chery/grade-11-review-2---methods-and-testing-cheryl-stephanie-1-1/src/gr11review/test2/Review2_3Test_3.txt"));
    
        String strWord = "";
        String alphaWord = "";

        while (strWord != null){
        
            strWord = reader.readLine();

            if(strWord != null && strWord.compareTo(alphaWord) < 0){
            
                alphaWord = strWord;
                
            }
        }
       
        reader.close();
        return alphaWord;
    }

    /**
     * author: Cheryl L
     * @param nums the array of numbers inputed
     * @param value change the value number into the same number beside the others
     * @return
     *  replaces the number inputed in the value and outputs copies of numbers beside it in the array
     */

    public static int[] notAlone(int[] nums, int value){

        for (int n = 1; n < nums.length - 1; n++){

            if (nums [n] == value){

                if(nums[n - 1] != nums[n] && nums[n + 1] != nums[n]){

                    if (nums[n - 1] > nums[n + 1]){
                    
                        nums[n] = nums[n + 1];
                        n++;
                    }
                    else if (nums[n - 1] < nums[n + 1]){
                    
                        nums[n] = nums[n - 1];
                    }
                }
            }
            else{

                n++;
            }
        }

        return nums;
    }

    /**
     * author: Cheryl L
     * @param n how many numbers will be in the array
     * @return
     * outputs a seires of numbers based on the pattern rule
     */

    public static int[] seriesUp(int n){

        int[] patternRule = new int[n * (n + 1) / 2];
        int p = 0;
        for(int a = 1; a <= n; a++){
            for(int b = 1; b <= a; b++){
                patternRule[p++] = b;
            }
        }
        return patternRule;
        
    }

    /**
     * author: Cheryl L
     * @param arr array output
     * @param row how many rows there are in the array given
     * @param col how many columns in the array given
     * @return
     * outputs the columns and rows of the 2D array inputed
     */

    public static int[][] split(int[][] arr, int row, int col){

        int[][] countArray = new int[row + 1][col + 1];

        for(int r = 0; r <= row; r++){
            for(int c = 0; c <= col; c++){
                countArray[r][c] = arr[r][c];
            }
            
        }

        return countArray;
    } 
}


