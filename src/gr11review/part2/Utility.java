package gr11review.part2;
import java.io.*;
import java.io.IOException;

/**
 * Grade 11 Java Review Part 2
 * @author Stephanie Tam
 */

public class Utility {

    /* 
    public static void main(String[] args) throws Exception{

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        String answer; //switch

        System.out.print("");
        str = keyboard.readLine();

        answer = xyBalance(str);
        answer = longestWord(str);
        System.out.print(answer);
        
        System.out.print("Length: ");
        int length = Integer.parseInt(keyboard.readLine());
        int[] nums;
        nums = new int[length];

        for(int i = 0; i < length; i++) {
            
            int num = Integer.parseInt(keyboard.readLine());
            nums[i] = num;
        }

        //int[] ans = withoutTen(nums);
        int[] ans = zeroFront(nums);
        
        System.out.println();

        for(int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    */

    //------------------------------------------------------

    /**
     * Array 5 - One Dimensional - Two Loops
     * A program determiens if array can be split equally
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
}
