import java.util.ArrayList;
public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        // YOUR CODE HERE
        int count = 0;
        for(int row = 0; row< mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                if(mat[row][col]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        // YOUR CODE HERE
        int biggest = Integer.MIN_VALUE;
        for(int row = 0; row< mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                if(mat[row][col]>biggest){
                    biggest = mat[row][col];
                }
            }
        }
        return biggest;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {

        for(int row = 0; row<mat.length; row++){
            int temp = mat[row][0];
            for(int col = 0; col<mat[0].length-1;col++){
                mat[row][col] = mat[row][col+1];
            }
            mat[row][mat[row].length -1] = temp;
        }
        return mat;
    }

    // Creates a 2D array of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int [][] mat = new int[arraySize][arraySize];
        for(int row = 0; row< mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                mat[row][col] = row + col;
            }
        }
        return mat;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double total = 0;
        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                total += mat[row][col];
            }
        }
        total/=(mat.length)*mat[0].length;
        return total;
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!

    public static double median(double[][] mat) {
        //ok first median for even and odd will b different
        double median = 0.0;
        ArrayList<Double> list = new ArrayList<Double>();
        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                list.add(mat[row][col]);
            }
           //odd
            if(list.size()%2!=0) {
                median = list.get(list.size() / 2);
            }
            //even...sum of both nearest to the middle divided by 2
            if(list.size()%2==0) {
                double mid1 = list.get((list.size()-1)/2);
                double mid2 = list.get((list.size()/2));
                median = (mid1 + mid2) / 2;
            }

        }
        return median;
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        //need a bit more time to think about this
     return 0.0;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}