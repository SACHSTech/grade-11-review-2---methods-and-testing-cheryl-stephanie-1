package gr11review.part2;

//import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;

//import java.text.*;
//import java.io.File;


public class Utility {

    //public static void main(String[] args) {
    //}   

    public static void main(String[] args) throws Exception{

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        String answer; //switch

        System.out.print("");
        str = keyboard.readLine();

        //answer = xyBalance(str);
        answer = longestWord(str);
        System.out.print(answer);
    }

    //------------------------------------------------------

    /**
     * A program that returns the longest word in the file.
     * @author Stephanie Tam
     * 
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
     * A program that will return true/false if the given string is xy-balanced.
     * @author Stephanie Tam
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
