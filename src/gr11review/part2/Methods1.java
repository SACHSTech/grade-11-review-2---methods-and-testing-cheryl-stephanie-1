package gr11review.part2;

/**
 * A program that will return true/false if the given string is xy-balanced.
 * @author Stephanie Tam
 * 
 */

public class Methods1 {

    /**
     * Determines of string is xy-balanced
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
   
}
