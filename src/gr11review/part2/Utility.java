package gr11review.part2;
import java.io.*;
import java.io.IOException;

/**
 * Grade 11 Java Review Part 2
 * @author Stephanie Tam
 */

public class Utility {

    public static void main(String[] args) 
    throws Exception{

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        /* 
        String str;
        String answer; //switch

        System.out.print("");
        str = keyboard.readLine();

        answer = xyBalance(str);
        answer = longestWord(str);
        System.out.print(answer);
        */

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

    //------------------------------------------------------

    /**
     * Array 3 - One Dimensional
     * A program that rearranges all the zeros to be grouped at the start of the array. 
     * @param nums integer array
     * @return version of array with zeroes at the start
     */

    public static int [] zeroFront(int[] nums){
        int update = 0;
        int i;
        int x;
    
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
        
        int intZero = 0;
        int intIndex;
        int intCount;
        int[] intArray = new int[nums.length];
       
        for (intIndex = 0; intIndex < nums.length; intIndex++){

            if (nums[intIndex] != 10){
                intArray[intIndex - intZero] = nums[intIndex];
            }
            else if (nums[intIndex] == 10){
                intZero++;
            }
        }
       
        if (intZero != 0){
            for (intCount = 0; intCount < intZero; intCount++){
                intArray[(nums.length - 1) - intCount] = 0;
            }
        }
        return intArray;
    }

    //------------------------------------------------------

    /**
     * File IO - Read 1
     * A program that returns the longest word in the file.
     * @param filenametxt
     * @param strLongestWord longest word length
     * @param strCurrentLength word length of current word
     * @return longest string word
     * @throws IOException
     */

    public static String longestWord(String filenametxt)throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("/Users/Cindy/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-cheryl-stephanie-1/src/gr11review/test2/Review2_3Test_1.txt"));

        String strLongestWord = "";
        String strCurrentLength;
        
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

        boolean x = false;
        boolean y = false;
        int i;

        int length = str.length();

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
        return y;
    }

    //------------------------------------------------------
    
}
