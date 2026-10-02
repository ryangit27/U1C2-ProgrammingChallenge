public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        double avg = (t1+t2+t3+t4)/4;
        // remove 0.0 and return your answer
        return avg;
    }

    public int roundAverage(double average) {
        int roundedAvg = (int)(average + (average%1));
        // remove 0 and return your answer
        return roundedAvg;
    }

    public boolean isPassing(int roundedAverage) {
        boolean pass = roundedAverage>=65;
        // remove false and return your answer
        return pass;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        double stock = shares * price;
        // remove 0.0 and return your answer
        return stock;
    }


    public int roundValueChange(double totalStock) {
        int roundedValue = (int)(totalStock + (totalStock%1));
        // remove 0 and return your answer
        return roundedValue;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        int two = ((((int)userDouble%100)/10+1)%10)*10;
        int three = ((((int)userDouble%10)+1)%10);
        int deci = (int)(userDouble % 1 * 100);

        double four = (deci + 10)%10*.1;
        double five = ((deci % 10)+1)%10 * .01;
        double finalans = two+three+four+five;
        // remove 0.0 and return your answer
        return finalans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }

}
