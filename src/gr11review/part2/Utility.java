package gr11review.part2;
import java.io.*;
import java.io.IOException;

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
    
        String strWord = reader.readLine();
        String alphaWord = "z";

        while (strWord != null){


            strWord = reader.readLine();

            if(strWord != null && strWord.compareTo(alphaWord) < 0){

                alphaWord = strWord; 
            }
        
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

                        nums[n] = nums[n - 1];
                        n++;
                    }
                    else if (nums[n - 1] < nums[n + 1]){
                        nums[n] = nums[n + 1];
                        n--;

                    
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


